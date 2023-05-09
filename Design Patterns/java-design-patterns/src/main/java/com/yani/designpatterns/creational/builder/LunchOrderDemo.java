package com.yani.designpatterns.creational.builder;

public class LunchOrderDemo {
    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();

        builder.bread("Whole grain")
               .condiments("Lettuce")
               .dressing("Barbeque sauce")
               .meat("Turkey");

        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}
