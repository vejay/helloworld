/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Vijay
 */
public class MainClass {
    
    public static void main(String[] args)
    {
     /*   Configuration config = new Configuration();
        SessionFactory factory = config.configure().buildSessionFactory();
        Context ctx = new Context(factory);
        CreateEvent cv = new CreateEvent(ctx);
        
        Event event = new Event();
        event.setId(1L);
        event.setName("Hibernate for Begineers");
        event.setDuration(2);
        
        cv.create(event); */
        
        //Switch on String works (yay!!!!)
        String s = "plus 1";
         switch(s) {
             case "vijay":
                    System.out.println("Hello Vijay");
                    break;
             case "akila":
                    System.out.println("Hi Akila");
                    break;
             default:
                    System.out.println("Hello Everyone");
                 
         }
        
         //Type inference for generic instance creation (works yay!!!)
         Map<String, String> map = new HashMap<>();
         map.put("vijay", "akila");
                  System.out.println("vijay is: " + map.get("vijay"));

         try (BufferedReader r = new BufferedReader(new FileReader("C:/test.txt"))) {
             r.read();
         } catch (IOException ex) {
             ex.printStackTrace();
         }
         
         
         //Catch Multiple Exceptions
         try {
             
         }
    }
    
}
