package com.company;

import org.junit.jupiter.api.Test;

import java.awt.event.MouseAdapter;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    void multiplication() {
        Money five  = Money.dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));

         five = Money.franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }

    @Test
    void currency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    void equality() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(6), new Dollar(5));

        assertEquals(new Franc(5), new Franc(5));
        assertNotEquals(new Franc(6), new Franc(5));

        assertNotEquals(new Dollar(5), new Franc(5));

        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.dollar(6));
    }

}