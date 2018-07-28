package io.futurera.algorithm;

import java.util.Arrays;
import java.util.Random;

public class PlusOneTest {

    private static final int NUM_TESTS = 10;
    private static final int MAXIMUM_ARRAY_LENGTH = 20;
    private static final int DIGIT_BOUND = 9;

    public static void main(String[] args) {
        test(null);
        test(new int[0]);
        test(new int[]{0});
        test(new int[]{9,9});
        test(new int[]{2,1,4,7,4,8,3,6,4,7});

        Random random = new Random();
        for (int i=0; i<NUM_TESTS; i++) {
            int l = random.nextInt(MAXIMUM_ARRAY_LENGTH);
            int[] input = new int[l];
            input[0] = random.nextInt(DIGIT_BOUND-1) + 1;//MSB>=1
            for (int j=1; i<l; i++) input[i] = random.nextInt(DIGIT_BOUND);
            test(input);
        }

        System.out.println("--------------------\nTest DONE");
    }

    private static void test(int[] input) {
        int[] expected = plusOneGolden(input);
        int[] actual = PlusOne.plusOne(input);
        if (!Arrays.toString(actual).equals(Arrays.toString(expected))) {
            System.out.println("\n[TEST FAILED]\nInput:"+ Arrays.toString(input) + "\nExpected :" + Arrays.toString(expected) + "\nActual: " + Arrays.toString(actual));
        }
    }


    public static int[] plusOneGolden(int[] digits) {
        if (digits == null || digits.length == 0) {
            return null;
        }

        int[] result = new int[digits.length + 1];
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i --) {
            result[i + 1] = (digits[i] + carry) % 10;
            carry =  (digits[i] + carry) / 10;
        }
        if (carry != 0) {
            result[0] = carry;
            return result;
        } else {
            return Arrays.copyOfRange(result, 1, result.length);
        }
    }
}