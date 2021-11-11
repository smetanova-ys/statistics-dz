package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] sales){
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long calculateAverage(long[] sales) {
        long average = calculateSum(sales) / sales.length;
        return average;
    }

    public int maxSales(long[] sales) {
        long max = sales[0];
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (max < sales[i]) {
                max = sales[i];
                month = i;
            }
        }
        month = month + 1;
        return month;
    }

    public int minSales(long[] sales) {
        long min = sales[0];
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (min > sales[i]) {
                min = sales[i];
                month = i;
            }
        }
        month = month + 1;
        return month;
    }

    public int amountMonthsBelowAverage(long[] sales) {
        int amountBelow = 0;
        long average = calculateAverage(sales);
        for (long sale : sales) {
            if (sale < average) {
                amountBelow += 1;
            }

        }
        return amountBelow;
    }

    public int amountMonthsAboveAverage(long[] sales) {
        int amountAbove = 0;
        long average = calculateAverage(sales);
        for (long sale : sales) {
            if (sale > average) {
                amountAbove += 1;
            }

        }
        return amountAbove;
    }
}
