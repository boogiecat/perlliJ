package com.intellij.lang.perl.parser;

import com.intellij.lang.perl.PerlLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * @author Anna Bulenkova
 */
public class PerlTokenTypes extends IElementType {
    public PerlTokenTypes(@NotNull @NonNls final String debugName) {
        super(debugName, PerlLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "PerlTokenTypes." + super.toString();
    }
}
