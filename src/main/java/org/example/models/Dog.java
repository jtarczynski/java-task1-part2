package org.example.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class Dog extends Mammal {

    private String name;

    private int age;

}
