// This is a generated file. Not intended for manual editing.
package com.intellij.lang.perl.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.perl.psi.PerlTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.perl.psi.*;

public class PerlItemImpl extends ASTWrapperPsiElement implements PerlItem {

  public PerlItemImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PerlVisitor) ((PerlVisitor)visitor).visitItem(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PerlAnyComment getAnyComment() {
    return findChildByClass(PerlAnyComment.class);
  }

  @Override
  @Nullable
  public PerlFunction getFunction() {
    return findChildByClass(PerlFunction.class);
  }

  @Override
  @Nullable
  public PerlKeyword getKeyword() {
    return findChildByClass(PerlKeyword.class);
  }

  @Override
  @Nullable
  public PerlStringLiteral getStringLiteral() {
    return findChildByClass(PerlStringLiteral.class);
  }

}
