package org.iims.oops.polymorphism.overloading;

public class MethodOverloadingDemo {

    static void sum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum " + sum);
    }

    static void sum(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Sum " + sum);
    }

    static long sum(long a, long b) {
        return a + b;
    }

    public static void main(String[] args) {
        sum(2, 3);
        sum(2, 3, 4);
        long result = sum(2L, 3L);
        System.out.println("Result " +result);
    }
}
