package org.example.models;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Display {

    public <T extends Animal> void displayDataX(Container<T> container) {
        System.out.println(container.getT().toString());
    }

    public <T extends Animal> void displayDataY(Container<T> container) {
        System.out.println(container.getT().toString());
    }

    public <T extends Animal> void displayDataZ(Container<T> container) {
        System.out.println(container.getT().toString());
    }
}
