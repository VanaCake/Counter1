package com.example.counter;

public class CounterClass {
    int value;
    int multiP;
    int cost;

    public CounterClass(int value) {
        this.value = value;
        multiP = 1;
        cost = 100;
    }

    public CounterClass() {
        multiP = 1;
        cost = 100;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void reset(){
        value = 0;
        multiP = 1;
    }

    public void increment(){value+= multiP;}

    public void changeIncrement(){multiP = multiP *2;}

    public int getValueMulti(){return multiP;}

    public int getCost(){return cost;}



}
