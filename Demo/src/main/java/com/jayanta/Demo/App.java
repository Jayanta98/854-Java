package com.jayanta.Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        Alien obj= new Alien();
        
        obj.setAid(101);
        obj.setAname("Jayanta");
        obj.setAcolor("Green");
        
        
        Configuration con= new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();
        session.save(obj);
        tx.commit();
    }
}
