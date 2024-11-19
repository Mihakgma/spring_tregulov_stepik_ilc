package spring_introduction;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet {
    Dog() {
        System.out.println(this.getClass().getSimpleName() + " has been created");
    }
    @Override
    public void say() {
        System.out.println("Bow-bow");
    }
}
