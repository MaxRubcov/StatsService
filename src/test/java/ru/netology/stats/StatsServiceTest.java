package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test

    public void shouldFindSumSales() {
        StatsService service = new StatsService();
        long[] sales = {9, 36, 2, 16, 1, 20, 19, 8, 19, 22, 41, 15};
        int expectedSumSales = 208;
        int actualSumSales = service.getSumSales(sales);
        Assertions.assertEquals(expectedSumSales, actualSumSales);
    }

    @Test

    public void shouldFindAverageSumSales() {
        StatsService service = new StatsService();
        long[] sales = {9, 36, 2, 16, 1, 20, 19, 8, 19, 22, 41, 15};
        int expectedAverageSumSales = 17;
        int actualAverageSumSales = service.getAverageSumSales(sales);
        Assertions.assertEquals(expectedAverageSumSales, actualAverageSumSales);
    }

    @Test

    public void shouldFindMaxMonthSales() {
        StatsService service = new StatsService();
        long[] sales = {9, 36, 2, 16, 1, 20, 19, 8, 19, 22, 41, 15};
        int expectedMaxMonthSales = 11;
        int actualMaxMonthSales = service.getMaxMonthSales(sales);
        Assertions.assertEquals(expectedMaxMonthSales, actualMaxMonthSales);
    }

    @Test

    public void shouldFindMinMonthSales() {
        StatsService service = new StatsService();
        long[] sales = {9, 36, 2, 16, 1, 20, 19, 8, 19, 22, 41, 15};
        int expectedMinMonthSales = 5;
        int actualMinMonthSales = service.getMinMonthSales(sales);
        Assertions.assertEquals(expectedMinMonthSales, actualMinMonthSales);
    }

    @Test

    public void shouldFindSumMonthBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {9, 36, 2, 16, 1, 20, 19, 8, 19, 22, 41, 15};
        int expectedSumMonthBelAv = 6;
        int actualSumMonthBelAv = service.getSumMonthBelowAverage(sales);
        Assertions.assertEquals(expectedSumMonthBelAv, actualSumMonthBelAv);
    }

    @Test

    public void shouldFindSumMonthAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {9, 36, 2, 16, 1, 20, 19, 8, 19, 22, 41, 15};
        int expectedSumMonthAbAv = 6;
        int actualSumMonthAbAv = service.getSumMonthAboveAverage(sales);
        Assertions.assertEquals(expectedSumMonthAbAv, actualSumMonthAbAv);
    }
}

