package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatisticsServiceTest {
    @Test

    public void findMax() {
        StatisticService service = new StatisticService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);


        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void findMaxAmongTheNegative() {
        StatisticService service = new StatisticService();
        long[] incomesInBillions = {2, -1, 3, 0, -3};
        long expected = 3;

        long actual = service.findMax(incomesInBillions);


        Assertions.assertEquals(expected, actual);
    }

}

