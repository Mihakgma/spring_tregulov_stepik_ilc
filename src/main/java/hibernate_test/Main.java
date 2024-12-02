package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        // подключение к базе (обертка от JDBC)
        // сессия - создается новая при каждом подключении к БД...
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        Employee employee = session.get(Employee.class, 1);
        session.beginTransaction();
        session.close();
        System.out.println(employee);
    }
}
