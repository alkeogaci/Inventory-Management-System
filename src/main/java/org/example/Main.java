package org.example;

import org.example.Configuration.HibernateConfiguration;

public class Main {
    public static void main(String[] args) {
        HibernateConfiguration.getSessionFactory();
        System.out.println("Hello World!");
    }
}