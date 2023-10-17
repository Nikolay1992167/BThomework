package ru.clevertec;

import java.math.BigDecimal;

public class StringUtils {

    private StringUtils() {
    }

    public static boolean isPositiveNumber(String str) {
        return org.apache.commons.lang3.StringUtils.isNumeric(str) &&
                BigDecimal.ZERO.compareTo(new BigDecimal(str)) < 1;
    }
}
