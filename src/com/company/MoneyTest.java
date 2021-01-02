package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    void addition() {
        Money sum = Money.dollar(5).plus(Money.dollar(5));
        assertEquals(Money.dollar(10), sum);
    }
    @Test
    void multiplication() {
        Money five  = Money.dollar(5);
        assertEquals(new Money(10, "USD"), five.times(2));
        assertEquals(new Money(15, "USD"), five.times(3));
    }

    @Test
    void currency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    void equality() {
        assertEquals(new Money(5, "USD"), new Money(5, "USD"));
        assertNotEquals(new Money(5, "USD"), new Money(6, "USD"));

        assertNotEquals(new Money(5, "USD"), new Money(5, "CHF"));

        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.dollar(6));
    }

}