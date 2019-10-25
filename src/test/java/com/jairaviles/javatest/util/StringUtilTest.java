package com.jairaviles.javatest.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilTest {

    @Test
    public void repeat_string_once() {
        assertEquals(StringUtil.repeat("hola", 1), "hola");

    }

    @Test
    public void repeat_string_multiple_times() {
        assertEquals(StringUtil.repeat("hola", 3), "holaholahola");

    }

    @Test
    public void repeat_string_zero_times() {
        assertEquals(StringUtil.repeat("hola", 0), "");

    }

    @Test
    public void repeat_string_negative_times() {
        assertThrows(IllegalArgumentException.class, () -> {
            StringUtil.repeat("hola", -1);
        });

    }
}
