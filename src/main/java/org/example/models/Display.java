package org.example.models;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Display {

    public <T extends Animal> void displayDataX(Container<T> container) {
        container.getT().forEach(System.out::println);
    }

    public <T extends Animal> void displayDataY(Container<T> container) {
//        displayDataX(container);
//        System.out.println(container.getT().isHuman());
    }

    public <T extends Animal> void displayDataZ(Container<T> container) {
//        T t = container.getT();
//        displayDataY(container);
//        System.out.println(t.getAge());
//        System.out.println(t.getName());
    }
}
