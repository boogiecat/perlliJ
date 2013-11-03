package com.intellij.lang.perl;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * @author Anna Bulenkova
 */
public class PerlElementType extends IElementType {
    public PerlElementType(@NotNull @NonNls final String debugName) {
        super(debugName, PerlLanguage.INSTANCE);
    }
}
