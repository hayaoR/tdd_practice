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

    public Expression plus(Expression addend) {
       return new Sum(this, addend);
    }

    Expression times(int multiplier) {
        return new Money(amount*multiplier, currency);
    }

    public Money reduce (Bank bank, String to) {
        int rate = bank.rate(currency, to);
        return new Money(amount / rate, to);
    }
      String currency() {
          return  currency;
      }

      @Override
      public String toString() {
        return amount + " "  +  currency;
      }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Money money = (Money) object;
        return this.amount == money.amount && this.currency.equals(money.currency);
    }
}
