package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {
    @Test
    void dollar_multiplication() {
        Dollar five = new Dollar(5);

        assertEquals(new Dollar(10),  five.times(2));
        assertEquals(new Dollar(15),  five.times(3));
    }

    @Test
    void multiplication() {
        Franc five = new Franc(5);

        assertEquals(new Franc(10),  five.times(2));
        assertEquals(new Franc(15),  five.times(3));
    }

    @Test
    void equality() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(6), new Dollar(5));

        assertEquals(new Franc(5), new Franc(5));
        assertNotEquals(new Franc(6), new Franc(5));

        assertNotEquals(new Dollar(5), new Franc(5));
    }

}