package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void isAllPositiveNumbers() {
        assertTrue(Utils.isAllPositiveNumbers("1", "2"));
        assertFalse(Utils.isAllPositiveNumbers("-1", "-2"));
        assertFalse(Utils.isAllPositiveNumbers("as", "qw"));
    }
}