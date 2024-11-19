package spring_introduction;

//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class Test4 {
//    public static void main(String[] args) {
//        try (ClassPathXmlApplicationContext context =
//                     new ClassPathXmlApplicationContext("applicationContext.xml");) {
//            // необходимо изучить РЕФЛЕКСИЮ!!!
//            Pet pet = (Pet) context.getBean("myPet", Pet.class);
//            // without dependency injection to make objects less dependent each of others!
//            // it's hardcoded dependency without outsourcing!
//            Person person = new Person(pet);
//            person.callYourPet();
//            // if we don't use try-with resources
//            // we need to close context with this construction
//            // context.close();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}
