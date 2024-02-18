package ru.netology.stats;

public class StatsService {

    public long SumSales(long[] sales) {
        long sumSales = 0;
        for (long i : sales) {
            sumSales += i;
        }
        return sumSales;
    }

    public long averageSales(long[] sales) {
        long sumSales = SumSales(sales);
        long averageAmount = sumSales / 12;
        return averageAmount;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int belowAverageSales(long[] sales) {
        long averageSumSales = averageSales(sales);
        int sumMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSumSales) {
                sumMonth++;
            }
        }
        return sumMonth;
    }


    public int aboveAverageSales(long[] sales) {
        long averageSumSales = averageSales(sales);
        int sumMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSumSales) {
                sumMonth++;
            }
        }
        return sumMonth;
    }
}
