package com.company;

public class Franc extends  Money {
    Franc (int amount) {
        this.amount = amount;
        this.currency = "CHF";
    }

    Franc times (int multiplier) {
        return new Franc(amount * multiplier);
    }

    String currency() {
        return currency;
    }
}
