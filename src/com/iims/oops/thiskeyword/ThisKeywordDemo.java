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

    public int getDeptId() {
        return deptID;
    }

    public String getName() {
        return name;
    }

}

public class ThisKeywordDemo {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setDeptID(1);
        employee.setName("Chris");

        System.out.println(employee.getDeptId());
        System.out.println(employee.getName());
    }
}
