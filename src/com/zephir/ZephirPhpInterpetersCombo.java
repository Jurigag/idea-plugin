package com.zephir;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import com.intellij.openapi.util.Condition;
import com.jetbrains.php.PhpBundle;
import com.jetbrains.php.config.interpreters.*;
import com.jetbrains.php.config.phpInfo.PhpInfo;
import org.jetbrains.annotations.Nullable;

public class ZephirPhpInterpetersCombo extends PhpInterpreterComboBox {
    private static final Condition<PhpSdkAdditionalData> INTERPRETERS_WITH_PARSER = (data) -> {
        Project project = ProjectManager.getInstance().getDefaultProject();
        String interpeterName = PhpInterpretersManagerImpl.getInstance(project).findInterpreterById(data.getInterpreterId()).getName();
        PhpInfo phpInfo = PhpInterpretersPhpInfoCacheImpl.getInstance(project).getPhpInfo(interpeterName);
        return phpInfo != null && (phpInfo.getLoadedExtensions().contains("Zephir Parser"));
    };

    public ZephirPhpInterpetersCombo(@Nullable Project project) {
        super(project, INTERPRETERS_WITH_PARSER);
    }
}
