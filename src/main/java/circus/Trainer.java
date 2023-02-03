package circus;

import circus.animals.Animal;
import circus.animals.Bird;
import circus.animals.Duck;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        getToSpeak(d);

        Bird b = (Bird) d;  // upcasting
        getToSpeak(b);

        Animal a = (Animal) b; // upcasting
        getToSpeak(a);

        Duck d2 = (Duck) a; // down-casting
        getToSpeak(d2);

        train(new Duck());
        // train(new Parrot());

        // Classes with "abstract" keyword can not be instantiated (type hierarchy)
        // Animal a2 = new Animal();
        // Bird b2 = new Bird();

    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        }
        else {
            System.out.println("Not a duck!");
        }
    }
}
