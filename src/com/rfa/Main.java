package com.rfa;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Constructor Dependency Injection
        FirstClass firstClass = new FirstClass();
        var secondClass = new SecondClass(firstClass);

        secondClass.printMethod();
    }
}

/**
 * The object is passed is of the First Class
 * In the second Class the method called which is declared in the interface
 * The Object passed in the SecondClass is of FirstClass -> FirstClass have the implementation
 * of the interface methods. Hence, the defined function of interface in FirstClass get called
 * in the SecondClass. The both classes are loosely coupled. If the change of function implementation
 * takes place in the FirstClass, then only the FirstClass get compiled. Now becuase the SecondClass
 * is not dependent on the concrete implementation it doesn't need to be recompiled. Hence, this is
 * loose coupling in action
 */