package com.intellij.lang.perl.lexer;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.MergingLexerAdapter;
import com.intellij.psi.tree.TokenSet;

/**
 * @author Anna Bulenkova
 */
public class PerlLexer extends MergingLexerAdapter {
    private static final TokenSet WHITESPACES_TO_MERGE = TokenSet.create();
    public PerlLexer() {
        super(new FlexAdapter(new _PerlLexer()), WHITESPACES_TO_MERGE);

    }
}
