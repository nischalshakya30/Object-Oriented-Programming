package com.iims.oops.inheritance;

public class Person {

    String firstName;

    String lastName;
    
    Person(){}

    Person(String fname, String lname) {
        firstName = fname;
        lastName = lname;
        System.out.println("Default constructor called");
    }

    void display() {
        System.out.println("Firstname " + firstName);
        System.out.println("Lastname " + lastName);
    }

}
