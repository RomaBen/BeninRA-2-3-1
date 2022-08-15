import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {
    @Test
    void shouldBeThreeIfBetweenTwoHundredAndThreeHundred() {
        SQRService service = new SQRService();

        // Подготовка данных
        int firstNumber = 200, secondNumber = 300;
        int expected = 3;

        // Вызов метода
        int actual = service.calculate(firstNumber, secondNumber);

        // Проверка
        assertEquals(expected, actual);
    }

    @Test
    void shouldBeThreeIfBetweenThreeHundredAndFourHundred() {
        SQRService service = new SQRService();

        // Подготовка данных
        int firstNumber = 300, secondNumber = 400;
        int expected = 3;

        // Вызов метода
        int actual = service.calculate(firstNumber, secondNumber);

        // Проверка
        assertEquals(expected, actual);
    }

    @Test
    void shouldBeThreeIfBetweenFourHundredAndFiveHundred() {
        SQRService service = new SQRService();

        // Подготовка данных
        int firstNumber = 400, secondNumber = 500;
        int expected = 3;

        // Вызов метода
        int actual = service.calculate(firstNumber, secondNumber);

        // Проверка
        assertEquals(expected, actual);
    }

    @Test
    void shouldBeFiveIfBetweenOneHundredAndTwoHundred() {
        SQRService service = new SQRService();

        // Подготовка данных
        int firstNumber = 100, secondNumber = 200;
        int expected = 5;

        // Вызов метода
        int actual = service.calculate(firstNumber, secondNumber);

        // Проверка
        assertEquals(expected, actual);
    }

    @Test
    void shouldBeNineIfBetweenFiveHundredAndOneThousand() {
        SQRService service = new SQRService();

        // Подготовка данных
        int firstNumber = 500, secondNumber = 1000;
        int expected = 9;

        // Вызов метода
        int actual = service.calculate(firstNumber, secondNumber);

        // Проверка
        assertEquals(expected, actual);
    }

    @Test
    void shouldBeThirteenIfBetweenOneThousandAndTwoThousand() {
        SQRService service = new SQRService();

        // Подготовка данных
        int firstNumber = 1000, secondNumber = 2000;
        int expected = 13;

        // Вызов метода
        int actual = service.calculate(firstNumber, secondNumber);

        // Проверка
        assertEquals(expected, actual);
    }

    @Test
    void shouldBeOneIfBetweenOneHundredTwentyAndIneHundredTwentyThree() {
        SQRService service = new SQRService();

        // Подготовка данных
        int firstNumber = 120, secondNumber = 123;
        int expected = 1;

        // Вызов метода
        int actual = service.calculate(firstNumber, secondNumber);

        // Проверка
        assertEquals(expected, actual);
    }

    @Test
    void shouldBeNinetyIfBetweenOneHundredAndTenThousand() {
        SQRService service = new SQRService();

        // Подготовка данных
        int firstNumber = 100, secondNumber = 10_000;
        int expected = 90;

        // Вызов метода
        int actual = service.calculate(firstNumber, secondNumber);

        // Проверка
        assertEquals(expected, actual);
    }
}
