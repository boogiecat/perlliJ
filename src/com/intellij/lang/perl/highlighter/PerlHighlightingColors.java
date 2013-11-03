package com.intellij.lang.perl.highlighter;

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

/**
 * @author Anna Bulenkova
 */
public class PerlHighlightingColors {
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey SQ_STRING =
            createTextAttributesKey("SQ_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey DQ_STRING =
            createTextAttributesKey("DQ_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey FUNCTION =
            createTextAttributesKey("FUNCTION", DefaultLanguageHighlighterColors.CONSTANT); //Purple
}
