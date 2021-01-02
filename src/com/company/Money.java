package com.company;

abstract class  Money {
    protected  int amount;
    protected  String currency;

    static Money dollar(int amount) {
        return new Dollar(amount);
    }

    static  Money franc(int amount) {
        return new Franc(amount);
    }

    abstract  Money times(int multiplier);
    abstract  String currency();

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Money money = (Money) object;
        return this.amount == money.amount;
    }
}
