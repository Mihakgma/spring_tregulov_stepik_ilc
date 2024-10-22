package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test7 {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("applicationContextPrototype.xml");) {
            // prototype scope has been set in another context-file
            // init and destroy methods are inside Cat class declaration!!!
            // init invoices when person obj created and
            // destroy invoices when Pet's bean destroys inside try-with resources block!
            // outside try-with resources block we must close context to destroy created beans!!!
            Person person = (Person) context.getBean("myPerson");
            person.callYourPet();
            person.setLastName("Oki-Doki");
            System.out.println(person);
            Person person2 = (Person) context.getBean("myPerson");
            System.out.println("links attached to similar object in memory?");
            System.out.println(person.equals(person2));
            // person = null;
            // person2 = null;
            System.out.println(person);
            System.out.println(person2);
            try {
                person.finalize();
                person2.finalize();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
