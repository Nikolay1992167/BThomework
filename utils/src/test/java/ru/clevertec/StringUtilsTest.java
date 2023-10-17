package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumberTest() {
        assertTrue(StringUtils.isPositiveNumber("1"));
        assertFalse(StringUtils.isPositiveNumber("-1"));
        assertFalse(StringUtils.isPositiveNumber("qw"));
    }
}