package com.sample.expression;
import java.util.List;
/**
 *
 * @author Vijay
 */
public class Expression {

    public  Term term;
    public SubExpr subExpr;

    public static class Term {

        public String key;
        public String operator;
        public String value;

    }

    public static class SubExpr {
        public  List<Expression> expressionList;
    }
}
