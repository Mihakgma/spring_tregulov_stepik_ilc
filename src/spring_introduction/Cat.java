package spring_introduction;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet {
    Cat() {
        System.out.println(this.getClass().getSimpleName() + " has been created");
    }

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }

    // we can use any name we like for init and destroy methods
    // but the most frequently used names are as follows
    public void init() {
        System.out.println(this.getClass().getSimpleName() + ": init method called");
    }

    // we can use any level of access modifier
    // we cant use the return result of these methods (init & destroy)
    // so often they have mark void!
    private void destroy() {
        System.out.println(this.getClass().getSimpleName() + ": destroy method called");
    }

}
