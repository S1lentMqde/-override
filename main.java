class Animal {
    private String name;
    protected int age;
    public String type;

    public Animal(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("Животное издаёт звук");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age, "Собака");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " гавкает: Гав-гав!");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age, "Кошка");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " мяукает: Мяу-мяу!");
    }
}

public class main {
    public main(String[] args) {
        Animal dog = new Dog("Шарик", 3);
        Animal cat = new Cat("Чоорный", 2);

        dog.makeSound();
        cat.makeSound();

        System.out.println("Тип животного: " + dog.type);
        System.out.println("Имя животного: " + dog.getName());
    }
}
