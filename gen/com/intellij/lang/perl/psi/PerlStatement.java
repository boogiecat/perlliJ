// This is a generated file. Not intended for manual editing.
package com.intellij.lang.perl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PerlStatement extends PsiElement {

  @NotNull
  List<PerlFunction> getFunctionList();

  @NotNull
  List<PerlKeyword> getKeywordList();

  @NotNull
  List<PerlStringLiteral> getStringLiteralList();

}
