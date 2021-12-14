package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    @Test
    void shouldCalcSum() {
        StatsService service = new StatsService();
        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calcSum(companySales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindAvg() {
        StatsService service = new StatsService();
        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.findAvg(companySales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMinSales() {
        StatsService service = new StatsService();
        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.findMinSales(companySales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMaxSales() {
        StatsService service = new StatsService();
        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.findMaxSales(companySales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindNumberOfSalesLowerAvg() {
        StatsService service = new StatsService();
        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.findNumberOfSalesLowerAvg(companySales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindNumberOfSalesUpperAvg() {
        StatsService service = new StatsService();
        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.findNumberOfSalesUpperAvg(companySales);

        assertEquals(expected, actual);
    }
}