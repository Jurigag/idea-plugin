package com.zephir;

import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SearchableConfigurable;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ZephirConfigurable implements SearchableConfigurable {
    @NotNull
    @Override
    public String getId() {
        return "preference.ZephirConfigurable";
    }

    @Nls
    @Override
    public String getDisplayName() {
        return "Zephir Plugin";
    }

    @Nullable
    @Override
    public String getHelpTopic() {
        return "preference.ZephirConfigurable";
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        return null;
    }

    @Override
    public boolean isModified() {
        return false;
    }

    @Override
    public void apply() throws ConfigurationException {

    }
}
