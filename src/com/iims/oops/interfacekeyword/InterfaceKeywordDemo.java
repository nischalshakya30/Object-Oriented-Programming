package com.iims.oops.interfacekeyword;

interface Bank {

    double getRateOfInterest();

}

class NICAsia implements Bank {

    @Override
    public double getRateOfInterest() {
        return 1.0;
    }
}

class PrabhuBank implements Bank {

    @Override
    public double getRateOfInterest() {
        return 2.0;
    }

}

public class InterfaceKeywordDemo {

    public static void main(String[] args) {
        Bank bank = new NICAsia();
        System.out.println("NIC Asia " + bank.getRateOfInterest());

        bank = new PrabhuBank();
        System.out.println("Prabhu bank " + bank.getRateOfInterest());
    }
}
