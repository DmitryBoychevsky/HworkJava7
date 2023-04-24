package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {
    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ZeroMinValuesNegative() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {0, 9, 5, -1, 11, 0, -11, 1, 11, 11, 10}; // нолевые, отрицательные, 2 ожидаемых подряд

        long expected = 11;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);


    }
}

