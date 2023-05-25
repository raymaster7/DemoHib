package com.ray.DemoHib;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Alien ray = new Alien();
        ray.setAid(100);
        ray.setAname("bot");
        ray.setColor("Green");
        
        Configuration con = new Configuration();
        
        SessionFactory sf = con.buildSessionFactory();
        
        Session session = sf.openSession();
        session.save(ray);
    }
}
