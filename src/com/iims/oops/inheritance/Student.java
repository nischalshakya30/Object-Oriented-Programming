package com.iims.oops.inheritance;

public class Student extends Person {

    String rollNumber;
    
    Student(){}

    Student(String fname, String lname, String rollNum) {
        super(fname, lname);
        rollNumber = rollNum;
    }

    void displayTwo() {
        super.display();
        System.out.println("Rollnumber " + rollNumber);
    }

    void display(String fname, String lname) {
        super.firstName = fname;
        super.lastName = lname;
        super.display();
        System.out.println("Rollnumber " + rollNumber);
    }

}
