package dev;

public class Counter {
    private int value;

    public Counter() {
        this.value = 0;
    }

    public int getIncrementValue() {
        return value;
    }

    public void increment() {
        value++;
    }
}
