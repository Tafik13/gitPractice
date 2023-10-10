package org.example.utils;

import com.github.javafaker.Faker;
import org.example.models.Student;

public class  FakeDataProvider {
    static Faker faker = new Faker();

    public static String generationFakeFirstName() {
        return faker.name().fullName();
    }

    public static String generationFakeLastName() {
        return faker.name().lastName();
    }

    public static String generationFakeEmail() {
        return faker.internet().emailAddress();
    }

    public static String generationPhoneNUmber() {
        return faker.number().digits(10);
    }

    public static String generationFakeCurrentAddress() {
        return faker.address().fullAddress();
    }

    public String generationFakePermanentAddress() {
        return faker.address().streetName() + " " + faker.address().streetAddressNumber();
    }
    public static Student createFakeStudent(){
        Student student= new Student();
        student.setFirstName(generationFakeFirstName());
        student.setLastName(generationFakeLastName());
        student.setEmail(generationFakeEmail());
        student.setPhoneNumber(generationPhoneNUmber());
        student.setCurrentAddress(generationFakeCurrentAddress());

        return student;
    }


}
