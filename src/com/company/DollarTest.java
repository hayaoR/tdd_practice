package com.company;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DollarTest {
    Dollar five = new Dollar(5);

    @Test
    void multiplication() {
        Dollar ten = five.times(2);
        assertEquals(10,  ten.amount);

        Dollar fifteen= five.times(3);
        assertEquals(15,  fifteen.amount);
    }
}