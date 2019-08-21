package com.newaeon.banking;

public class StringTest {

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = new String("ab");

        System.out.println("should return false: " + s1.equals(null));
        System.out.println("should return true (two instances same state): "
                + s1.equals(s2));

        System.out.println(s1.equals(s2) == s2.equals(s1));

        System.out.println("should return true: " + s2.equals(s2));
        System.out.println("should have same hashcode: "
                + (s1.hashCode() == s2.hashCode()));
    }
}
