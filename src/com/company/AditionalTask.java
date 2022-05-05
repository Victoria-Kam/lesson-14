package com.company;

public class AditionalTask<T> {

    public void task(T temp, int value) {
        if (value == 1) {
            MyInterface<StringBuilder> myInterface = (type) -> type.reverse();
            StringBuilder reult = myInterface.doSomething((StringBuilder) temp);
            System.out.println(reult);
        } else if (value == 2) {
            MyInterface<Integer> myInterface = (type) -> (type == 0 )? 1: type * (type -1); // не считает факториал
            Integer factorial = myInterface.doSomething((Integer) temp);
            System.out.println("Факториал числа " + temp + " равен: " + factorial);
        }

    }
}

