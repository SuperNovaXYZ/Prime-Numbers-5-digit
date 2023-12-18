/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primesum;

public class PrimeSum {
    public static int sumOfPrimesWithDigit5(int n) {
        int sum = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i) && containsDigit5(i)) {
                sum += i;
            }
        }

        return sum;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static boolean containsDigit5(int number) {
    String numStr = String.valueOf(number);
    return numStr.contains("5");
}
    public static void main(String[] args) {
    }
}
