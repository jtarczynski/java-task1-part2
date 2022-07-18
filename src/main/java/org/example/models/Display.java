package org.example.models;

import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class Display {

    public void displayAnimalData(Container<? extends Animal> container) {
        printList(container.getT());
    }

    public void displayMammalData(Container<? extends Mammal> container) {
        printList(container.getT());
    }

    public void displayDogData(Container<? extends Dog> container) {
        printList(container.getT());
    }

    private void printList(List<?> list) {
        list.forEach(System.out::println);
    }
}
