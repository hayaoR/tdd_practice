package com.company;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DollarTest {

    @Test
    void multiplication() {
        Dollar five = new Dollar(5);
        Dollar ten = five.times(2);
        assertEquals(10,  ten.amount);

        Dollar fifteen= five.times(3);
        assertEquals(15,  fifteen.amount);
    }

    @Test
    void equality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}