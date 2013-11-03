package com.intellij.lang.perl.highlighter;

import com.intellij.lang.perl.lexer.PerlLexer;
import com.intellij.lexer.LayeredLexer;

/**
 * @author Anna Bulenkova
 */
public class PerlHighlightingLexer extends LayeredLexer {
    public PerlHighlightingLexer() {
        super(new PerlLexer());
    }
}

