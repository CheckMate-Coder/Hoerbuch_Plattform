import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PersistenceUnit;
import jakarta.transaction.Transactional;

public class Main {
@PersistenceUnit
private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceUnit");
@PersistenceContext
static EntityManager em;
	public static void main(String[] args) {
	}
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}	
}