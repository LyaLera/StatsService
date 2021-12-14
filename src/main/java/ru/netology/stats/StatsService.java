package ru.netology.stats;

public class StatsService {

    public int calcSum (int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAvg(int[] sales) {
        return calcSum(sales) / sales.length;
    }

    public int findMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int findMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int findNumberOfSalesLowerAvg(int[]sales) {
        int numberOfMonth = 0;
        int month = 0;
        int average = 15;
        for (int sale : sales) {
            if (sale < average) {
                numberOfMonth +=1;
            }
            month = month +1;
        }
        return numberOfMonth;
    }

    public int findNumberOfSalesUpperAvg(int[]sales) {
        int numberOfMonth = 0;
        int month = 0;
        int average = 15;
        for (int sale : sales) {
            if (sale > average) {
                numberOfMonth +=1;
            }
            month = month +1;
        }
        return numberOfMonth;
    }
}
