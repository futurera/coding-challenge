package io.futurera.algorithm;

import java.util.Arrays;
import java.util.Random;

public class PlusOne {


    /**
     * Given a non-empty array of digits representing a non-negative integer, plus
     * one to the integer. The digits are stored such that the most significant
     * digit is at the head of the list, and each element in the array contain a
     * single digit.You may assume the integer does not contain any leading zero,
     * except the number 0 itself.
     * 
     * For example: Input: [1,2,3] Output: [1,2,4] Explanation: The array represents
     * the integer 123.
     */
    public static int[] plusOne(int[] digits) {
        return null;
    }

    /**********************************************************************
     *                                                                    *
     * Below are to test your codes. DO NOT LOOK WHEN YOU ARE CODING!     *
     *                                                                    *
     **********************************************************************/

    private static final int NUM_TESTS = 10;
    private static final int MAXIMUM_ARRAY_LENGTH = 20;
    private static final int DIGIT_BOUND = 9;

    public static void main(String[] args) {
        test(null);
        test(new int[0]);
        test(new int[] { 0 });
        test(new int[] { 9, 9 });
        test(new int[] { 2, 1, 4, 7, 4, 8, 3, 6, 4, 7 });

        Random random = new Random();
        for (int i = 0; i < NUM_TESTS; i++) {
            int l = random.nextInt(MAXIMUM_ARRAY_LENGTH);
            int[] input = new int[l];
            input[0] = random.nextInt(DIGIT_BOUND - 1) + 1;
            for (; i < l; i++)
                input[i] = random.nextInt(DIGIT_BOUND);
            test(input);
        }
        System.out.println("--------------------\nTest DONE");
    }

    private static void test(int[] input) {
        int[] expected = plusOneGolden(input);
        int[] actual = PlusOne.plusOne(input);
        if (!Arrays.toString(actual).equals(Arrays.toString(expected))) {
            System.out.println("\n[TEST FAILED]\nInput:" + Arrays.toString(input) + "\nExpected :"
                    + Arrays.toString(expected) + "\nActual: " + Arrays.toString(actual));
        }
    }

    private static int[] plusOneGolden(int[] digits) {
        if (digits == null || digits.length == 0) {
            return null;
        }
        int[] result = new int[digits.length + 1];
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            result[i + 1] = (digits[i] + carry) % 10;
            carry = (digits[i] + carry) / 10;
        }
        if (carry != 0) {
            result[0] = carry;
            return result;
        } else {
            return Arrays.copyOfRange(result, 1, result.length);
        }
    }
}