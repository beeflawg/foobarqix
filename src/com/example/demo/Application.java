package com.example.demo;

public class Application {
    public static void main(String[] args) {
        int startingNumber = 105;

        Context context = new Context(new Foo());
        System.out.println("Foo: " + context.executeStrategy(startingNumber));

        context = new Context(new Bar());
        System.out.println("Bar: " + context.executeStrategy(startingNumber));

        context = new Context(new Qix());
        System.out.println("Qix: " + context.executeStrategy(startingNumber));

        context = new Context(new FooBarQix());
        System.out.println("FooBarQix: " + context.executeStrategy(startingNumber));


    }
}
