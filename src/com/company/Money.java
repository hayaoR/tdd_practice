package com.company;

public class Money {
    protected  int amount;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Money money = (Money) object;
        return this.amount == money.amount;
    }
}
