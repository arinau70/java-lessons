package lesson06;

import lesson06.animals.Bird;
import lesson06.animals.Cat;
import lesson06.animals.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурка");
        Dog dog = new Dog("Шарик");
        Bird bird = new Bird();

        cat.voice();
        dog.voice();
        dog.eat();
        bird.voice();
    }
}
