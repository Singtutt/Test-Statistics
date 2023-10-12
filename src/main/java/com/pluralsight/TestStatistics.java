package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
//  Define array
        int[] testScores = {85, 92, 78, 95, 88, 91, 84, 89, 97, 76};
//  Average Calculation (Display)
        double average = calculateAverage(testScores);
        System.out.println("Average Score: " + average);
//  High Score Calculator (Display)
        int highScore = calculateHighScore(testScores);
        System.out.println("High Score: " + highScore);
//  Low Score Calculator (Display)
        int lowScore = calculateLowScore(testScores);
        System.out.println("Low Score: " + lowScore);
//  Median Calculator (Display)
        int median = calculateMedian(testScores);
        System.out.println("Median Score: " + median);
    }

//  Average Calculator (Method)
    public static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length; // Calculate and return the average
    }

//  High Score Calculator (Method)
    public static int calculateHighScore(int[] scores) {
        int highScore = scores[0];
        for (int score : scores) {
            if (score > highScore) {
                highScore = score;
            }
        }
        return highScore; // Return the highest score
    }

//  Lowest Score Calculator (Method)
    public static int calculateLowScore(int[] scores) {
        int lowScore = scores[0];
        for (int score : scores) {
            if (score < lowScore) {
                lowScore = score;
            }
        }
        return lowScore; // Return the lowest score
    }

//  Median Calculator (Method)
    public static int calculateMedian(int[] scores) {
        Arrays.sort(scores); // Utilize .sort method

        int middle = scores.length / 2; // Find middle index

        if (scores.length % 2 == 0) {
//  Median even occurrence
            int middle1 = scores[middle - 1];
            int middle2 = scores[middle];
            return (middle1 + middle2) / 2; // Return the median
        } else {
//  Median odd occurrence
            return scores[middle];
        }
    }
}