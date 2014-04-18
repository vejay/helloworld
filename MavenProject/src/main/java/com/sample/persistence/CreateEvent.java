/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.persistence;

import com.sample.Context;
import com.sample.events.model.Event;
import org.hibernate.classic.Session;

/**
 *
 * @author Vijay
 */
public class CreateEvent {
   
    public CreateEvent(Context ctx)
    {
        this.ctx = ctx;
    }
    
    public void create(Event event)
    {
        Session session = ctx.getSessionFactory().openSession();
        session.saveOrUpdate(event);
        session.flush();
        session.close();
    }
    
    private Context ctx;
}
