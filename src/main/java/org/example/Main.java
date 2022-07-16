package org.example;

import org.example.models.*;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main( String[] args ) {

        Container<Animal> animalContainer = new Container<>(new Animal(1234L));

        Container<Mammal> mammalContainer = new Container<>(new Mammal("cos"));

        Container<Dog> dogContainer = new Container<>(new Dog("Burek", 12));

        Display display = new Display();

        display.displayDataX(animalContainer);

        display.displayDataY(mammalContainer);

        display.displayDataZ(dogContainer);
    }
}
