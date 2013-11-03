package com.intellij.lang.perl.highlighter;

import com.intellij.lang.perl.parser.PerlTokenSets;
import com.intellij.lang.perl.psi.PerlTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anna Bulenkova
 */
public class PerlSyntaxHighlighter extends SyntaxHighlighterBase {
    private static final Map<IElementType, TextAttributesKey> myMap = new HashMap<IElementType, TextAttributesKey>();
    static {
        myMap.put(PerlTypes.COMMENT, PerlHighlightingColors.COMMENT);
        myMap.put(PerlTypes.DOUBLE_QUOTED_STRING, PerlHighlightingColors.DQ_STRING);
        myMap.put(PerlTypes.SINGLE_QUOTED_STRING, PerlHighlightingColors.SQ_STRING);
        safeMap(myMap, PerlTokenSets.KEYWORDS, PerlHighlightingColors.KEYWORD);
        safeMap(myMap, PerlTokenSets.FUNCTIONS, PerlHighlightingColors.FUNCTION);
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new PerlHighlightingLexer();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(final IElementType tokenType) {
        return pack(myMap.get(tokenType));
    }
}
