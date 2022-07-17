package org.example;

import org.example.models.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Container<Animal> animalContainer = new Container<>(
                List.of(new Animal(1234L),
                        new Dog("Burek", 10),
                        new Mammal(false)));

        Display display = new Display();

        display.displayDataX(animalContainer);

//        display.displayDataY(mammalContainer);
//
//        display.displayDataZ(dogContainer);
    }
}
