package com.sensacionalapps.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeraModelo {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("GURPS");
        factory.close();
    }
}
