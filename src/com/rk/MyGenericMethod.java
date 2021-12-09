
package com.rk;

public class MyGenericMethod {

    public static <E> void showData(E[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

}
