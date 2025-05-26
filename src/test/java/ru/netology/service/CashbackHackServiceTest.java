package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void shouldReturn100WhenAmount900() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0WhenAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual); // Этот тест упадёт - баг!
    }

    @Test
    public void shouldReturn999WhenAmount1() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int actual = service.remain(1);
        assertEquals(expected, actual);
    }
}