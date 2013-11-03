package com.intellij.lang.perl;

import com.intellij.lang.Language;

/**
 * @author Anna Bulenkova
 */
public class PerlLanguage extends Language {
    public static final PerlLanguage INSTANCE = new PerlLanguage();

    private PerlLanguage() {
        super("Perl");
    }
}
