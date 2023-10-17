package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumberTestWithPositiveNumber() {
        assertTrue(StringUtils.isPositiveNumber("1"));
    }

    @Test
    void isPositiveNumberTestWithNegativeNumber() {
        assertFalse(StringUtils.isPositiveNumber("-1"));
    }

    @Test
    void isPositiveNumberTestNotANumber() {
        assertFalse(StringUtils.isPositiveNumber("qw"));
    }
}