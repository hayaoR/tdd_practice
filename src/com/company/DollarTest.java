package com.company;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DollarTest {

    @Test
    void multiplication() {
        Dollar five = new Dollar(5);

        assertEquals(new Dollar(10),  five.times(2));
        assertEquals(new Dollar(15),  five.times(3));
    }

    @Test
    void equality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}