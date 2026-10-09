package mypack;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory factory =
            new Configuration()
                    .configure()
                    .addAnnotatedClass(Student.class)
                    .addAnnotatedClass(StudentDetails.class)
                    .buildSessionFactory();

    public static SessionFactory getSessionFactory() {
        return factory;
    }
}