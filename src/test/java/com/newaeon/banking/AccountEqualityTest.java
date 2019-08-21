package com.newaeon.banking;

public class AccountEqualityTest {

    public static void main(String[] args) {
        Account ind1 = new Investment("0987123", "Eyad");
        Account ind2 = new Individual("0987123", "Sami");

        System.out.println(ind1.equals(ind2));
        System.out.println(ind2.equals(ind1));
    }
}