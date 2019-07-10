package com.example.demo;

public class Context {
    private IFooBarQix strategy;

    public Context(IFooBarQix strategy){
        this.strategy = strategy;
    }

    public String executeStrategy(int startingNumber){
        return strategy.calculate(startingNumber);
    }
}
