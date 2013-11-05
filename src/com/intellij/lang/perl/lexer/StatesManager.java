package com.intellij.lang.perl.lexer;

import java.util.Stack;

/**
 * @author Anna Bulenkova
 */
public class StatesManager {
    private final Stack<Integer> statesStack;
    private final _PerlLexer lexer;

    public StatesManager(_PerlLexer lexer) {
        this.lexer = lexer;
        statesStack = new Stack<Integer>();
    }

    public void reset() {
        statesStack.clear();
    }

    public void toPreviousState() {
        assert (statesStack.size() >= 2);
        statesStack.pop();
        lexer.yybegin(statesStack.peek());
    }

    public void toState(final int state) {
        statesStack.push(state);
        lexer.yybegin(state);
    }

    public int getStackSize() {
        return statesStack.size();
    }
}
