public class Animal {
    private String name;         
    protected int age;         
    public String species;      

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public void speak() {
        System.out.println("Animal makes a sound.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age, "Dog");
    }

    @Override
    public void speak() {
        System.out.println(getName() + " barks.");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age, "Cat");
    }

    @Override
    public void speak() {
        System.out.println(getName() + " meows.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog("Rex", 5);
        Animal myCat = new Cat("Whiskers", 3);

        myDog.speak(); 
        myCat.speak(); 
    }
}
