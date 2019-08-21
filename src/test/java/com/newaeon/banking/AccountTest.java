package com.newaeon.banking;

public class AccountTest {

    public static void main(String[] args) {
        Object ind1 = new Individual("0987123", "Eyad");
        Object ind2 = new Individual("0987123", "Sami");

        System.out.println("ind1 eq ind2: " + ind1.equals(ind2));
        System.out.println("ind2 eq ind1: " + ind2.equals(ind1));

        System.out.println("ind1.hash: " + ind1.hashCode());
        System.out.println("ind2.hash: " + ind2.hashCode());
        System.out.println("ind1.hash eq ind2.hash: " + (ind1.hashCode() == ind2.hashCode()));

    }
}
