package org.example.test;

import org.example.unittest.DayInMonth_b3;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayInMonth_b3Test {
    private DayInMonth_b3 dayInMonthB3;
    int year;
    int month;

    @BeforeEach
    void setUp() {
        dayInMonthB3 = new DayInMonth_b3();
        year = 2024;
        month = 2;
    }

    @Test
    void dayInMonth() {
        int expected = 29;
        int actualed = dayInMonthB3.dayInMonth(year, month);
        assertEquals(expected, actualed);
    }
    @Test
    void dayInMonth1() {
        int year = 2001;
        int month = 4;
        int expected = 30;
        int actualed = dayInMonthB3.dayInMonth(year, month);
        assertEquals(expected, actualed);
    }

    @Test
    void dayInMonth2() {
        int year = 2001;
        int month = 1;
        int expected = 31;
        int actualed = dayInMonthB3.dayInMonth(year, month);
        assertEquals(expected, actualed);
    }

    @Test
    void dayInMonth3() {
        int year = 2001;
        int month = 13;
        int expected = 0;
        int actualed = dayInMonthB3.dayInMonth(year, month);
        assertEquals(expected, actualed);
    }

    @Test
    void dayInMonth4() {
        int year = 2000;//  2000 chia hết cho 400
        int month = 2;
        int expected = 29;
        int actualed = dayInMonthB3.dayInMonth(year, month);
        assertEquals(expected, actualed);
    }
    @Test
    void dayInMonth5() {
        int year = 2001; // ko thỏa mãn dk year % 400 == 0) || (year % 4 == 0 && year % 100 != 0
        int month = 2;
        int expected = 28;
        int actualed = dayInMonthB3.dayInMonth(year, month);
        assertEquals(expected, actualed);
    }

}