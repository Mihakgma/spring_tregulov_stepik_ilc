package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("applicationContext.xml");) {
            // необходимо изучить РЕФЛЕКСИЮ!!!
            Pet pet = (Pet) context.getBean("myPet", Pet.class);
            pet.say();
            // if we don't use try-with resources
            // we need to close context with this construction
            // context.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
