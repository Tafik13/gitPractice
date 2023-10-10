package org.example.models;

import lombok.*;

@AllArgsConstructor //с конструктором
@NoArgsConstructor  // без конструктора
@Getter // геттер
@Setter// сеттер
@Builder
@ToString
@EqualsAndHashCode

@Data
public class Student {


    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String currentAddress;

}
