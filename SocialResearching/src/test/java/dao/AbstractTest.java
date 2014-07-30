package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;

public abstract class AbstractTest {
    public static EntityManagerFactory factory = Persistence
	    .createEntityManagerFactory("punit");
    protected EntityManager manager;
    protected EntityTransaction transaction;

    @Before
    public void initEntityManager() throws Exception {
	manager = factory.createEntityManager();
	transaction = manager.getTransaction();
    }

    @After
    public void closeEntityManager() throws Exception {
	if (manager != null) {
	    manager.close();
	}
    }
}
