package org.example;

import org.example.models.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Container<Animal> animalContainer = new Container<>(
                List.of(new Animal(1234L),
                        new Dog("Burek", 10),
                        new Mammal(false)));

        Container<Mammal> mammalContainer = new Container<>(
                List.of(new Mammal(false),
                        new Mammal(true)));

        Container<Dog> dogContainer = new Container<>(
                List.of(new Dog("Azor", 13),
                        new Dog("Kamil", 7)));

        Display display = new Display();

        //Dog container can display Animal, Mammal and Dog data
        display.displayAnimalData(dogContainer);
        display.displayMammalData(dogContainer);
        display.displayDogData(dogContainer);

        //Animal container can display AnimalData
        display.displayAnimalData(animalContainer);
        
        //display DogData or MammalData for Animal Container gives compilation error
        display.displayDogData(animalContainer);
        display.displayMammalData(animalContainer);
    }
}
