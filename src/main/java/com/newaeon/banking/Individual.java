package com.newaeon.banking;

public class Individual extends Investment {

    public Individual(String number, String owner) {
        super(number, owner);
    }

    @Override
    public void withdraw(Double amount) {
        if (isNullAmount(amount))
            throw new IllegalArgumentException("amount is null");
        if (!withinLimits(amount)) {
            throw new IllegalArgumentException("withdraw limit 500 exceeded");
        }
        super.withdraw(amount);
    }

    private boolean withinLimits(Double amount) {
        return amount <= 500;
    }


}
