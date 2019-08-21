package com.newaeon.banking;

public abstract class Account {
    private String number;
    private String owner;
    private Double balance = 0.0;

    protected Account(String number, String owner) {
        this.number = number;
        this.owner = owner;
    }

    public String getNumber() {
        return number;
    }

    public String getOwner() {
        return owner;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(Double amount) {
        validTransactionAmount(amount);
        if (!isValidAmount(amount)) {
            throw new IllegalArgumentException("invalid amount");
        }
        balance += amount;
    }

    public void withdraw(Double amount) {
        validTransactionAmount(amount);
        if (!isValidWithdrawAmount(amount)) {
            throw new IllegalArgumentException(" insufficient balance or invalid amount ");
        }
        balance -= amount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass())
            return false;
        Account other = (Account) obj;
        return this.number.equals(other.number);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + number.hashCode();
        return result;
    }

    private void validTransactionAmount(Double amount) {
        if (isNullAmount(amount))
            throw new IllegalArgumentException("amount is null");
    }

    protected final boolean isNullAmount(Double amount) {
        return amount == null;
    }

    private boolean isValidWithdrawAmount(Double amount) {
        return isValidAmount(amount) && isSufficientBalance(amount);
    }

    private boolean isValidAmount(Double amount) {
        return amount > 0;
    }

    private boolean isSufficientBalance(Double amount) {
        return balance >= amount;
    }
}
