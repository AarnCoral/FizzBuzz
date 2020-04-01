package com.AarnCoral.FizzBuzz;

public class Main {
    private static int FIZZ_MOD = 3;
    private static int BUZZ_MOD = 5;
    private static int NUM_COUNT = 100;
    private static String FIZZ = "Fizz";
    private static String BUZZ = "Buzz";
    private static String FIZZ_BUZZ = "FizzBuzz";

    public static void main(String[] args) {
        for (int i = 1; i <= NUM_COUNT; i++) {
            System.out.println(calculateFizzBuzz(i));
        }
    }

    private static String calculateFizzBuzz(int number){
        if (number % (FIZZ_MOD * BUZZ_MOD) == 0) {
            return FIZZ_BUZZ;
        } else if (number % FIZZ_MOD == 0) {
            return FIZZ;
        } else if (number % BUZZ_MOD == 0) {
            return BUZZ;
        } else {
            return Integer.toString(number);
        }
    }
}
