package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        System.out.println("main method");
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Dog dog = context.getBean("dog", Dog.class);
        Dog dog2 = context.getBean("dog", Dog.class);
        System.out.println(dog2.equals(dog));
        System.out.println(dog == dog2);
        System.out.println(dog);
        System.out.println(dog2);
        dog.say();
        context.close();
    }
}
