/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iims.oops;

/**
 *
 * @author msii
 */
public class Student {

    int id;

    String name;

    long rollNumber;
    
    Student(int studentId) {
        id = studentId;
    }

    void display() {
        System.out.println("Id " + id);
        System.out.println("Name " + name);
        System.out.println("Roll Number " + rollNumber);
    }

    public static void main(String[] args) {

        Student studentOne = new Student(1);
        
        studentOne.name = "Ram";
        studentOne.rollNumber = 1234L;
        studentOne.display();

        Student studentTwo = new Student(2);
        
        studentTwo.name = "Shyam";
        studentTwo.rollNumber = 5678L;
        studentTwo.display();

    }

}
