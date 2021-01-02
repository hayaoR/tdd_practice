package com.company;

 public class Money implements  Expression {
    protected  int amount;
    protected  String currency;

    Money(int amount, String  currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static  Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    Expression plus(Money added) {
       return new Money(this.amount + added.amount, currency);
    }

    Money times(int multiplier) {
        return new Money(amount*multiplier, currency);
    }
      String currency() {
          return  currency;
      }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Money money = (Money) object;
        return this.amount == money.amount && this.currency.equals(money.currency);
    }
}
