package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void isPositiveNumberTestWithPositiveNumber() {
        assertTrue(Utils.isAllPositiveNumbers("1", "2"));
    }

    @Test
    void isPositiveNumberTestWithNegativeNumber() {
        assertFalse(Utils.isAllPositiveNumbers("-1", "-2"));
    }

    @Test
    void isPositiveNumberTestNotANumber() {
        assertFalse(Utils.isAllPositiveNumbers("as", "qw"));
    }
}