package com.iims.oops.thiskeyword;

class Employee {

    private int deptID;
    private String name;

    Employee() {
        this("Employee Information");
    }

    Employee(String info) {
        System.out.println(info);
    }

    public void setDeptID(int deptID) {
        this.deptID = deptID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        this.displayDeptID();
        this.displayName();
    }

    private void displayDeptID() {
        System.out.println("Dept ID " + deptID);
    }

    private void displayName() {
        System.out.println("Name " + name);
    }

}

public class ThisKeywordDemo {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setDeptID(1);
        employee.setName("Chris");

        employee.display();
    }
}
