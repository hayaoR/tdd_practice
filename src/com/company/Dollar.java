package com.company;

public class Dollar extends  Money {
    Dollar (int amount) {
        this.amount = amount;
        this.currency = "USD";
    }

    Dollar times (int multiplier) {
        return new Dollar(amount * multiplier);
    }

    String currency() {
        return currency;
    }
}
