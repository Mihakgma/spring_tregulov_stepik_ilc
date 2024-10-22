package spring_introduction;

public class Person {
    private Pet pet;
    private String lastName;
    private int age;

    Person() {
        System.out.println(this.getClass().getSimpleName() + " has been created");
    }


    public Person(Pet pet) {
        this.pet = pet;
        System.out.println(this.getClass().getSimpleName() + " has been created");
    }

    public void setPet(Pet pet) {
        this.pet = pet;
        System.out.println(pet + " pet set");
    }

    public Pet getPet() {
        return pet;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

    public void init() {
        System.out.println(this.getClass().getSimpleName() + ": init method called");
    }

    private void destroy() {
        System.out.println(this.getClass().getSimpleName() + " has been destroyed");
    }

    @Override
    public void finalize() throws Throwable {
        super.finalize();
        destroy();
    }

    @Override
    public String toString() {
        return "Person{" +
                "pet=" + pet +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
