package spring_introduction;

public class Person {
    Person() {
        System.out.println(this.getClass().getSimpleName() + " has been created");
    }
    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
        System.out.println(this.getClass().getSimpleName() + " has been created");
    }

    public void setPet(Pet pet) {
        this.pet = pet;
        System.out.println(pet + " pet set");
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

}
