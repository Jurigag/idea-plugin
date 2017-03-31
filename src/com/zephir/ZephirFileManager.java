package com.zephir;

import com.intellij.openapi.editor.Document;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.fileEditor.FileDocumentManagerAdapter;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import com.jetbrains.php.composer.

import java.util.Objects;

public class ZephirFileManager extends FileDocumentManagerAdapter {
    protected String parserOutput;
    protected VirtualFile currentFile;

    @Override
    public void beforeDocumentSaving(@NotNull Document document) {
        currentFile = FileDocumentManager.getInstance().getFile(document);
        if (currentFile != null) {
            if (Objects.equals(currentFile.getExtension(), "zep")) {
                if(!checkFile()) {
                    processError();
                };
            }
        }
        super.beforeDocumentSaving(document);
    }

    private boolean checkFile()
    {
        String path = currentFile.getPath();
    }

    private void processError()
    {

    }
}
