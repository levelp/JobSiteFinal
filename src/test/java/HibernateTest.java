import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by d.tyufanov on 16.12.2014.
 */
public class HibernateTest {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("myEntityManager");

    }
}
