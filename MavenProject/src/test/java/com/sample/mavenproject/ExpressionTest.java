package com.sample.mavenproject;
import com.sample.expression.ExpressionHelper;
import com.sample.expression.Expression;
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Vijay
 */
public class ExpressionTest
{   
    @Test
    public void testSimple()
    {
           Expression expr = new Expression();
           expr.term = new Expression.Term();
           expr.term.key = "DEFAULT";
           expr.term.operator = "EQUALS";
           expr.term.value = "HottieBombaLottie";

           boolean isComplex = ExpressionHelper.isComplex(expr);
           assertFalse("Expression is not simple", isComplex);
    }
    
    @Test
    public void testSimple_1()
    {
        Expression expr = new Expression();
        expr.subExpr = new Expression.SubExpr();
        expr.subExpr.expressionList = new ArrayList<Expression>();
       
        Expression e1 = new Expression();
        e1.term = new Expression.Term();
        e1.term.key = "title";
        e1.term.operator = "equals";
        e1.term.value = "hottie";
        
        Expression e2 = new Expression();
        e2.term = new Expression.Term();
        e2.term.key = "Release_Year";
        e2.term.operator = "equals";
        e2.term.value = "2008";
        
        Expression e3 = new Expression();
        e2.term = new Expression.Term();
        e2.term.key = "Description";
        e2.term.operator = "equals";
        e2.term.value = "Hottie BombaLattie";
        
        expr.subExpr.expressionList.add(e1);
        expr.subExpr.expressionList.add(e2);
        expr.subExpr.expressionList.add(e3);
        
        boolean isComplex = ExpressionHelper.isComplex(expr);
        assertFalse("Expression is complex. Expected simple" , isComplex);
    }
   
    @Test
    public void testComplex()
    {
        Expression expr = new Expression();
        Expression.Term term = new Expression.Term();
        term.key = "test";
        term.operator = "equal";
        term.value = "value";
        expr.term = term;
            
        Expression.SubExpr  subExpr = new Expression.SubExpr();
        Expression e1 = new Expression();
        e1.term = new Expression.Term();
        e1.term.key = "test1";
        
        Expression e2 = new Expression();
        e2.subExpr = new Expression.SubExpr();
        
        Expression e21 = new Expression();
        e21.term = new Expression.Term();
        e21.term.key = "Title";
        e21.term.operator = "EQUALS";
        e21.term.value = "Hottie";
        
        Expression e22 = new Expression();
        e21.subExpr = new Expression.SubExpr();
        
        Expression e221 = new Expression();
        e221.term = new Expression.Term();
        e221.term.key = "Description";
        e221.term.operator = "EQUALS";
        e221.term.value = "Hottie is a great value";
        
        Expression e222 = new Expression();
        e222.term = new Expression.Term();
        e222.term.key = "Release_Year";
        e222.term.operator = "equals";
        e222.term.value = "2008";
        
        e21.subExpr = new Expression.SubExpr();
        e21.subExpr.expressionList = new ArrayList<Expression>();
        e21.subExpr.expressionList.add(e221);
        e21.subExpr.expressionList.add(e222);
        
        e2.subExpr = new Expression.SubExpr();
        e2.subExpr.expressionList = new ArrayList<Expression>();
        e2.subExpr.expressionList.add(e21);
        e2.subExpr.expressionList.add(e22);
        
        subExpr.expressionList = new ArrayList<Expression>();
        subExpr.expressionList.add(e1);
        subExpr.expressionList.add(e2);
        expr.subExpr = subExpr;
        
        boolean isComplex  = ExpressionHelper.isComplex(expr);
        assertTrue("Expression is not complex", isComplex);
    }
}
