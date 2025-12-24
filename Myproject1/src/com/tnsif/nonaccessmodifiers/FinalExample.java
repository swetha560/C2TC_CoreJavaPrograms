package com.tnsif.nonaccessmodifiers;

public class FinalExample {

    int x = 100;

    void print() {
        System.out.println("Print the value of x: " + x);
    }
}

class Example extends FinalExample {

    @Override
    void print() {
        System.out.println("Overridden value of x: " + x);
    }

    public static void main(String[] args) {
        Example e = new Example();
        e.x = 200;
        e.print();
    }
}
