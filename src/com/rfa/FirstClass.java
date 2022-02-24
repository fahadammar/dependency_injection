package com.rfa;

public class FirstClass implements InterfaceWork {
    int a = 0;
    int b = 3;

    @Override
    public int add() {
        return a += b;
    }

    @Override
    public void print() {
        System.out.println("Print Method Called: " + add());
    }

}
