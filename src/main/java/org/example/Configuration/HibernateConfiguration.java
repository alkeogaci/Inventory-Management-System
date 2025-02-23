package org.example.Configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfiguration {

    public static SessionFactory getSessionFactory(){ return sessionFactory; }

    private static final SessionFactory sessionFactory = build();

    private static SessionFactory build(){
        try{

            return new Configuration()
                    .configure("hibernate.cfg.xml")
                    .buildSessionFactory();

        }catch (ExceptionInInitializerError eiie){
            throw new ExceptionInInitializerError(eiie);
        }
    }
}
