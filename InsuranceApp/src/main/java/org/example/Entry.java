package org.example;

public class Entry {

    private final String name;
    private final String lastName;
    private final int phoneNumber;
    private final int age;


    public Entry(String name, String lastName, int phoneNumber, int age)  {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    @Override
    public String toString() {
        return name + " " + lastName + " " + phoneNumber + " " + age;
    }

}
