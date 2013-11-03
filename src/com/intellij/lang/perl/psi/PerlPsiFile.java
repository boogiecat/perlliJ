package com.intellij.lang.perl.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.perl.PerlFileType;
import com.intellij.lang.perl.PerlLanguage;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

/**
 * @author Anna Bulenkova
 */
public class PerlPsiFile extends PsiFileBase {
    public PerlPsiFile(FileViewProvider provider) {
        super(provider, PerlLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return PerlFileType.INSTANCE;
    }
}


