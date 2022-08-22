package ru.netology.service;

//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    void shouldRemain() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    void shouldRemainAmount1() {
        int actual = service.remain(1);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    void shouldLess1000() {
        int actual = service.remain(800);
        int expected = 200;
        assertEquals(actual, expected);
    }

    @Test
    void shouldMore1000() {
        int actual = service.remain(1300);
        int expected = 700;
        assertEquals(actual, expected);
    }
}