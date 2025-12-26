package com.mycompany.app;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import com.mycompany.app.entities.Book;

import jakarta.persistence.EntityManager;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello from Java!");

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("artclass_persistence_unit");
    EntityManager em = emf.createEntityManager();

    try {
      em.getTransaction().begin();
      Book book = new Book();
      book.setName("rasvi");
      book.setIsbn("1232312");
      em.persist(book);
      em.getTransaction().commit();
    }
    finally {
      em.close();
    }
  }
}