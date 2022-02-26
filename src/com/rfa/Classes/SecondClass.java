package com.rfa.Classes;

import com.rfa.Interface.InterfaceWork;

public class SecondClass {
    private InterfaceWork intWork;

    public SecondClass(InterfaceWork interFaceObj){
        this.intWork = interFaceObj;
    }

    public void printMethod(){
        System.out.println("The Object Passed is of the FirstClass: " + this.intWork.add());
    }

    // METHOD INJECTION
    public void printMethod(InterfaceWork methodInjection){
        System.out.println("The Object Passed is of the FirstClass: " + methodInjection.add());
    }


    // SETTER INJECTION
    public void setterInjection(InterfaceWork setterInjection){
        this.intWork = setterInjection;
    }
}
