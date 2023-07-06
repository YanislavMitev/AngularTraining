package com.yani.designpatterns.behavioral.iterator;

import java.util.Iterator;

public class BikeIterator<T> implements Iterator {
    private int currentIndex;
    private T[] bikes;

    BikeIterator(T[] bikes) {
        this.bikes = bikes;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < bikes.length && bikes[currentIndex] != null;
    }

    @Override
    public Object next() {
        return bikes[currentIndex++];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Currently not supported...");
    }
}
