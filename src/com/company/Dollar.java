package com.company;

public class Dollar {
    private int amount;
    Dollar (int amount) {
        this.amount = amount;
    }

    Dollar times (int multiplier) {
        return new Dollar(amount * multiplier);
    }

    Boolean equals(Dollar dollar) {
        return this.amount == dollar.amount;
    }

}
