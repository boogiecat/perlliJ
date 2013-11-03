// This is a generated file. Not intended for manual editing.
package com.intellij.lang.perl.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class PerlVisitor extends PsiElementVisitor {

  public void visitAnyComment(@NotNull PerlAnyComment o) {
    visitPsiElement(o);
  }

  public void visitFunction(@NotNull PerlFunction o) {
    visitPsiElement(o);
  }

  public void visitItem(@NotNull PerlItem o) {
    visitPsiElement(o);
  }

  public void visitKeyword(@NotNull PerlKeyword o) {
    visitPsiElement(o);
  }

  public void visitStringLiteral(@NotNull PerlStringLiteral o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
