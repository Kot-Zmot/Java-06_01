package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @Test
    public void squareNumberTest() {
        SQRService service = new SQRService();
        int result = service.calculate(200, 300);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    public void squareNumberOutOfRange() {
        SQRService service = new SQRService();
        int result = service.calculate(1, 99);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void squareNumberOnValueLimit() {
        SQRService service = new SQRService();
        int result = service.calculate(100, 100);
        int expected = 1;
        assertEquals(expected, result);
    }
}
