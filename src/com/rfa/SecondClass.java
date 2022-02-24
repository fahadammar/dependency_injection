package com.rfa;

public class SecondClass {
    private InterfaceWork intWork;

    SecondClass(InterfaceWork interFaceObj){
        this.intWork = interFaceObj;
    }

    void printMethod(){
        System.out.println("The Object Passed is of the FirstClass: " + this.intWork.add());
    }
}
