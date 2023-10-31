package org.example.Clases;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import  org.hibernate.SessionFactory;
public class Conexion {

    private static final SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Error al crear la SessionFactory: " + ex);
            throw new ExceptionInInitializerError(ex);
        }

    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}