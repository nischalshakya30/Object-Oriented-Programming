package com.iims.oops.abstractkeyword;

abstract class Bank {

    abstract double getRateOfInterest();

    void setName(String name) {
        System.out.println("Name " + name);
    }

}

class NICAsia extends Bank {

    @Override
    double getRateOfInterest() {
        return 1.0;
    }
}

class PrabhuBank extends Bank {

    @Override
    double getRateOfInterest() {
        return 2.0;
    }

}

public class AbstractKeywordDemo {

    public static void main(String[] args) {
        Bank bank = new NICAsia();
        System.out.println("NIC Asia " + bank.getRateOfInterest());
        bank.setName("NIC Asia");

        bank = new PrabhuBank();
        System.out.println("Prabhu bank " + bank.getRateOfInterest());
        bank.setName("Prabhu Bank");
    }
}
