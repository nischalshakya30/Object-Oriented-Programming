package com.iims.oops.inheritance;

public class InhertianceMain {

    public static void main(String[] args) {
        Student student = new Student();
        student.firstName = "Chris";
        student.lastName = "Bane";
        student.rollNumber = "1234";

        System.out.println("Student info");
        System.out.println("-----------------------------------");
        System.out.println("FirstName " + student.firstName);
        System.out.println("LastName " + student.lastName);
        System.out.println("Rollnumber " + student.rollNumber);
        System.out.println("-----------------------------------");

        Student studentTwo = new Student("Ram", "Shrestha", "3456");
        studentTwo.displayTwo();

        Employee employee = new Employee();
        employee.firstName = "Hari";
        employee.lastName = "Thapa";
        employee.salary = 2000.0;

        System.out.println("Employee info");
        System.out.println("-----------------------------------");
        System.out.println("FirstName " + employee.firstName);
        System.out.println("LastName " + employee.lastName);
        System.out.println("Salary " + employee.salary);
        System.out.println("-----------------------------------");
    }

}
