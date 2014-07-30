package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Author;

public class Main {

    public static void main(String[] args) {
	EntityManagerFactory managerFactory = Persistence
		.createEntityManagerFactory("punit");
	EntityManager entityManager = managerFactory.createEntityManager();

	EntityTransaction tx = entityManager.getTransaction();
	tx.begin();
	Author author = entityManager.find(Author.class, 36152);
	author.getFirstName();
	author.getAuthorDetails();
    }

}
