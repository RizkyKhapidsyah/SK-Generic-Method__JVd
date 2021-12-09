
package com.rk;

public class GenericMethodDemo {

    public static void main(String[] args) {
        Integer[] numbers = {5, 8, 7, 11, 20};
        String[] cars = {"mobil 1", "mobil 2", "mobil 3"};

        System.out.println("show data numbers");
        MyGenericMethod.showData(numbers);

        System.out.println();
        System.out.println("show data cars");
        MyGenericMethod.showData(cars);
    }
}
