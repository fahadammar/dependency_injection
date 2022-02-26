package com.rfa;

import com.rfa.Classes.FirstClass;
import com.rfa.Classes.SecondClass;

public class Main {

    public static void main(String[] args) {

        // Constructor Dependency Injection
        FirstClass firstClass = new FirstClass();
        var secondClass = new SecondClass(firstClass);

        secondClass.printMethod();

        // SETTER INJECTION passing the object in the setter function
        secondClass.setterInjection(firstClass);
        secondClass.printMethod();

        // METHOD INJECTION
        secondClass.printMethod(firstClass);
    }
}

/**
 * The object is passed is of the First Class
 * In the second Class the method called which is declared in the interface
 * The Object passed in the SecondClass is of FirstClass -> FirstClass have the implementation
 * of the interface methods. Hence, the defined function of interface in FirstClass get called
 * in the SecondClass. The both classes are loosely coupled. If the change of function implementation
 * takes place in the FirstClass, then only the FirstClass get compiled. Now because the SecondClass
 * is not dependent on the concrete implementation it doesn't need to be recompiled. Hence, this is
 * loose coupling in action.
 */

/**
 * We most oftenly use the CONSTRUCTOR DEPENDECY INJECTION OR CONSTRUCTOR INJECTION because
 * with this approach we can quickly see the dependencu of our class in a glance
 * */