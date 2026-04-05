/**
 * Created by darya on 11/12/14.
 */

import model.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateTest {

    public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("JobSite");
    public static EntityManager em = emf.createEntityManager();

    //EntityManager em = getEntityManager();

    public static void main(String[] args) {

       User user1 = new User();
        user1.setEmail("dah@mail.ru");
        user1.setUserId(1);
        user1.setfName("Ivan");
        user1.setsName("Ivanov");
        user1.setPassword("123456");
        user1.setPhone(999);

        User user2 = new User();
        user2.setEmail("sjfnkw@mail.ru");
        user2.setUserId(2);
        user2.setfName("Petr");
        user2.setsName("Petrov");
        user2.setPassword("777");
        user2.setPhone(123);

        em.getTransaction().begin();
        em.persist(user1);
        em.getTransaction().commit();
    }
}
