package a0707;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        //매개변수의 다형성
        AnimalSound(new Dog());
        AnimalSound(new Cat());
    }

    public static void AnimalSound(Animal animal) {
        animal.sound();
    }
}
