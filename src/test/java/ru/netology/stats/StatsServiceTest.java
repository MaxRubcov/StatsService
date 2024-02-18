package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test

    public void shouldFindSumSales() {
        StatsService service = new StatsService();
        long[] sales = {9, 36, 2, 16, 1, 20, 19, 8, 19, 22, 41, 15};
        long expectedSumSales = 208;
        long actualSumSales = service.SumSales(sales);
        Assertions.assertEquals(expectedSumSales, actualSumSales);
    }

    @Test

    public void shouldFindAverageAmount() {
        StatsService service = new StatsService();
        long[] sales = {9, 36, 2, 16, 1, 20, 19, 8, 19, 22, 41, 15};
        long expectedSales = 17;
        long actualSales = service.averageSales(sales);
        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test

    public void shouldFindMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {9, 36, 2, 16, 1, 20, 19, 8, 19, 22, 41, 15};
        int expectedMaxMonth = 11;
        int actualMaxMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test

    public void shouldFindMinSales() {
        StatsService service = new StatsService();
        long[] sales = {9, 36, 2, 16, 1, 20, 19, 8, 19, 22, 41, 15};
        int expectedMinMonth = 5;
        int actualMinMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test

    public void shouldFindSumMonthBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {9, 36, 2, 16, 1, 20, 19, 8, 19, 22, 41, 15};
        int expectedSumMonth = 6;
        int actualSumMonth = service.belowAverageSales(sales);
        Assertions.assertEquals(expectedSumMonth, actualSumMonth);
    }

    @Test

    public void shouldFindSumMonthAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {9, 36, 2, 16, 1, 20, 19, 8, 19, 22, 41, 15};
        int expectedSumMonth = 6;
        int actualSumMonth = service.aboveAverageSales(sales);
        Assertions.assertEquals(expectedSumMonth, actualSumMonth);
    }
}

