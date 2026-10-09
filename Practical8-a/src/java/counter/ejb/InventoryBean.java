package counter.ejb;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java.util.List;
import mypack.Product;

@Stateless
public class InventoryBean {

    private EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("InventoryPU");

    public void addProduct(Product product) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            em.persist(product);
            tx.commit();
        } finally {
            em.close();
        }
    }

    public List<Product> getProducts() {

        EntityManager em = emf.createEntityManager();

        try {
            return em.createQuery(
                    "SELECT p FROM Product p", Product.class)
                    .getResultList();
        } finally {
            em.close();
        }
    }
}