package ru.netology.stats;

public class StatsService {

    public int getSumSales(int[] sales) {
        int sumSales = 0;
        for (int i : sales) {
            sumSales += i;
        }
        return sumSales;
    }

    public int getAverageSumSales(int[] sales) {
        int sumSales = getSumSales(sales);
        int averageSumSales = sumSales / 12;
        return averageSumSales;
    }

    public int getMaxMonthSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinMonthSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getSumMonthBelowAverage(int[] sales) {
        int averageSumSales = getAverageSumSales(sales);
        int sumMonthBelAv = 0;
        //int sumMonthAboveAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSumSales) {
                sumMonthBelAv++;
            }
        }
        return sumMonthBelAv;
    }


    public int getSumMonthAboveAverage(int[] sales) {
        int averageSumSales = getAverageSumSales(sales);
        int sumMonthAbAv = 0;
        //int sumMonthAboveAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSumSales) {
                sumMonthAbAv++;
            }
        }
        return sumMonthAbAv;
    }
}
