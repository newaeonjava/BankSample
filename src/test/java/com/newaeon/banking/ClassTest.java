package com.newaeon.banking;

import java.lang.reflect.Method;

public class ClassTest {

    public static void main(String[] args) {
        Object ind1 = new Individual("45678", "sami");
        Account ind2 = new Individual("45678", "hussam");

        Class type1 = ind2.getClass();
        Class type2 = ind1.getClass();

        System.out.println(type1 == type2);
        System.out.println(type1.equals(type2));


        System.out.println(type1.getSimpleName());
        System.out.println(type1.getCanonicalName());

        Method[] methods = type1.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        Method[] declaredMethods = type1.getDeclaredMethods();
        System.out.println("========================declared methods");
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
        }

    }
}
