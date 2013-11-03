// This is a generated file. Not intended for manual editing.
package com.intellij.lang.perl.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

public interface PerlItem extends PsiElement {

  @Nullable
  PerlAnyComment getAnyComment();

  @Nullable
  PerlFunction getFunction();

  @Nullable
  PerlKeyword getKeyword();

  @Nullable
  PerlStringLiteral getStringLiteral();

}
