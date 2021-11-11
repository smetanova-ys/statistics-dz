package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @org.junit.jupiter.api.Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();

        long expected = 180;
        long actual = service.calculateSum(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateAverage() {
        StatsService service = new StatsService();

        long expected = 15;
        long actual = service.calculateAverage(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldFindMonthMax() {
        StatsService service = new StatsService();

        int expected = 6;
        long actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldFindMonthMin() {
        StatsService service = new StatsService();

        int expected = 9;
        long actual = service.minSales(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldFindMonthsBelowAverage() {
        StatsService service = new StatsService();

        int expected = 5;
        long actual = service.amountMonthsBelowAverage(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldFindMonthsAboveAverage() {
        StatsService service = new StatsService();

        int expected = 5;
        long actual = service.amountMonthsAboveAverage(sales);

        assertEquals(expected, actual);
    }

}