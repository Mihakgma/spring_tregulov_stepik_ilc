package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("applicationContext.xml");) {
            // dependency injection in action!!!
            Person person = (Person) context.getBean("myPerson");
            person.callYourPet();
            // if we don't use try-with resources
            // we need to close context with this construction
            // context.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
