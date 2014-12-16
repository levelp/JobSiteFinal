import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Загрузка с БД
 */
public class HibernateTest {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("myEntityManager");

    }
}
