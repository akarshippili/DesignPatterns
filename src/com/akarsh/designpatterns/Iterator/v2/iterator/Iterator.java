package com.akarsh.designpatterns.Iterator.v2.iterator;

public interface Iterator<T> {

    /**
     * Returns true if the iterator has more elements.
     */
    boolean hasNext();

    /**
     * Returns the next element in the iterator.
     */
    T next();
}
