package io.futurera.algorithm.tests;

import java.util.Arrays;
import java.util.Random;

import io.futurera.algorithm.MaximumSubarray;

/**********************************************************************
 * * Below are to test your codes. DO NOT LOOK WHEN YOU ARE CODING! * *
 **********************************************************************/
public class MaximumSubarrayTestRunner {

  private static final int NUM_TESTS = 10;
  private static final int MAXIMUM_ARRAY_LENGTH = 20;
  private static final int NUMBER_BOUND = 100;

  public static void main(String[] args) {
    test(null);
    test(new int[0]);
    test(new int[] { 0 });
    test(new int[] { -2, 2, -3, 4, -1, 2, 1, -5, 3 });
    Random random = new Random();
    for (int i = 0; i < NUM_TESTS; i++) {
      int l = random.nextInt(MAXIMUM_ARRAY_LENGTH);
      int[] input = new int[l];
      int sign = random.nextBoolean() ? 1 : -1;
      for (; i < l; i++)
        input[i] = sign * random.nextInt(NUMBER_BOUND);
      test(input);
    }
    System.out.println("--------------------\nTest DONE");
  }

  private static void test(int[] input) {
    int expected = maxSubArrayGolden(input);
    int actual = MaximumSubarray.run(input);
    if (actual != expected) {
      System.out.println(
          "\n[TEST FAILED]\nInput:" + Arrays.toString(input) + "\nExpected :" + expected + "\nActual: " + actual);
    }
  }

  private static int maxSubArrayGolden(int[] nums) {
    // O(n) time with O(1) space
    if (nums == null || nums.length == 0) {
      return 0;
    }
    // in case the result is negative.
    int max = Integer.MIN_VALUE;
    int sum = 0;
    for (int num : nums) {
      sum += num;
      max = Math.max(sum, max);
      sum = Math.max(sum, 0);
    }
    return max;
  }
}