/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import org.hibernate.SessionFactory;

/**
 *
 * @author Vijay
 */
public class Context {
    
    
    public Context(SessionFactory sessionFactory)
    {
        this.sessionFactory  = sessionFactory;
    }
    
    public SessionFactory getSessionFactory() {
        return this.sessionFactory;
    }
    
    private SessionFactory sessionFactory;
}
