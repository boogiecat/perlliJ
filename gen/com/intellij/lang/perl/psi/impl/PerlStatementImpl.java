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

public class PerlStatementImpl extends ASTWrapperPsiElement implements PerlStatement {

  public PerlStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PerlVisitor) ((PerlVisitor)visitor).visitStatement(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PerlFunction> getFunctionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PerlFunction.class);
  }

  @Override
  @NotNull
  public List<PerlKeyword> getKeywordList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PerlKeyword.class);
  }

  @Override
  @NotNull
  public List<PerlStringLiteral> getStringLiteralList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PerlStringLiteral.class);
  }

}
