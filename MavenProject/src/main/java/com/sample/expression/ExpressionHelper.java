/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.expression;

/**
 *
 * @author Vijay
 */
public class ExpressionHelper 
{
    public static boolean isComplex(Expression expression)
    {
        boolean ret;
        if(expression == null)
        {
            return false;
        }
        
        boolean isSubExprEmpty = (expression.subExpr == null) ||  
                (expression.subExpr.expressionList == null) ||  (expression.subExpr.expressionList.isEmpty());
        
        if(isSubExprEmpty || (expression.term == null && !isSubExprEmpty))
        {
            ret =  false;
        }
        else
        {
            ret = true;
        }
        return ret;
    }
}
