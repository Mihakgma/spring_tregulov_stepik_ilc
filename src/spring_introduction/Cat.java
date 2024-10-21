package spring_introduction;

public class Cat implements Pet {
    Cat() {
        System.out.println(this.getClass().getSimpleName() + " has been created");
    }

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }

}
