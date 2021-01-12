package com.company;

public class Sum implements  Expression{
    Money augend;
    Money addend;

    Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public  Money reduce(Bank bank, String to) {
        int addrate = bank.rate(this.addend.currency,  to);
        int augrate = bank.rate(this.augend.currency,  to);
        int amount = augend.amount / augrate+ addend.amount / addrate;
        return new Money(amount, to);
    }
}
