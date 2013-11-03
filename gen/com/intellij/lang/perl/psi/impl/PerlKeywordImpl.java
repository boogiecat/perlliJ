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

public class PerlKeywordImpl extends ASTWrapperPsiElement implements PerlKeyword {

  public PerlKeywordImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PerlVisitor) ((PerlVisitor)visitor).visitKeyword(this);
    else super.accept(visitor);
  }

}
