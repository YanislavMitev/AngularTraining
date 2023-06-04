package com.yani.designpatterns.structural.decorator;

public abstract class SandwichDecorator implements Sandwich {
    protected Sandwich customSandwich;

    protected SandwichDecorator(Sandwich customSandwich) {
        this.customSandwich = customSandwich;
    }

    public String make() {
        return customSandwich.make();
    }
}
