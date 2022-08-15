package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"Should be 3 if between 200 and 300, 200, 300, 3",
                        "Should be 3 if between 300 and 400, 300, 400, 3",
                        "Should be 3 if between 400 and 500, 400, 500, 3",
                        "Should be 5 if between 100 and 200, 100, 200, 5",
                        "Should be 9 if between 500 and 1000, 500, 1000, 9",
                        "Should be 13 if between 1000 and 2000, 1000, 2000, 13",
                        "Should be 1 if between 120 and 122, 120, 122, 1",
                        "Should be 90 if between 100 and 10000, 100, 10000, 90"})
    void shouldBeSomething(String testName, int firstNumber,
                           int secondNumber, int expected) {
        SQRService service = new SQRService();
        // Вызов метода
        int actual = service.calculate(firstNumber, secondNumber);

        // Проверка
        assertEquals(expected, actual);
    }
}
