package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("applicationContext.xml");) {
            // singletone scope is default scope in Spring!!!
            Person person = (Person) context.getBean("myPerson");
            person.setLastName("Oki-Doki");
            System.out.println(person);
            Person person2 = (Person) context.getBean("myPerson");
            System.out.println("links attached to similar object in memory?");
            System.out.println(person.equals(person2));
            System.out.println(person);
            System.out.println(person2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
