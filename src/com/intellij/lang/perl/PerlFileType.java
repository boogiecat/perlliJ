package com.intellij.lang.perl;

import com.intellij.openapi.fileTypes.LanguageFileType;
import icons.PerlIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @author Anna Bulenkova
 */
public class PerlFileType extends LanguageFileType {
    public static final PerlFileType INSTANCE = new PerlFileType();

    protected PerlFileType() {
        super(PerlLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
      return "Perl";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Perl file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "pl";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return PerlIcons.perlIcon;
    }
}
