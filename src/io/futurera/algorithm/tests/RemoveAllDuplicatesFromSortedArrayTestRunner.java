package io.futurera.algorithm.tests;

import java.util.Arrays;
import io.futurera.algorithm.RemoveAllDuplicatesFromSortedArray;

/**********************************************************************
 * * Below are to test your codes. DO NOT LOOK WHEN YOU ARE CODING! * *
 **********************************************************************/
public class RemoveAllDuplicatesFromSortedArrayTestRunner {

  public static void main(String[] args) {
    happyCase1();
    happyCase2();
    happyCase3();
    happyCase4();
    happyCase5();
    happyCase6();
    happyCase7();
    happyCase8();
    System.out.println("--------------------\nTest DONE");
  }

  private static boolean happyCase1() {
    int[] testData = new int[] { 1, 2, 2, 3 };
    int[] expectedResult = new int[] { 1, 2, 3 };
    int[] actualResult = RemoveAllDuplicatesFromSortedArray.run(testData);
    for (int i = 0; i < expectedResult.length; i++) {
      if (expectedResult[i] != actualResult[i]) {
        System.out.println("expect output is [1,2,3] but actual output is " + Arrays.toString(actualResult));
        return false;
      }
    }
    return true;
  }

  private static boolean happyCase2() {
    int[] testData = new int[] { 1, 2, 2, 2, 3 };
    int[] expectedResult = new int[] { 1, 2, 3 };
    int[] actualResult = RemoveAllDuplicatesFromSortedArray.run(testData);
    for (int i = 0; i < expectedResult.length; i++) {
      if (expectedResult[i] != actualResult[i]) {
        System.out.println("expect output is [1,2,2,3] but actual output is " + Arrays.toString(actualResult));
        return false;
      }
    }
    return true;
  }

  private static boolean happyCase3() {
    int[] testData = new int[] { 1, 2, 2, 3, 3 };
    int[] expectedResult = new int[] { 1, 2, 3 };
    int[] actualResult = RemoveAllDuplicatesFromSortedArray.run(testData);
    for (int i = 0; i < expectedResult.length; i++) {
      if (expectedResult[i] != actualResult[i]) {
        System.out.println("expect output is [1,2,3] but actual output is " + Arrays.toString(actualResult));
        return false;
      }
    }
    return true;
  }

  private static boolean happyCase4() {
    int[] testData = new int[] {};
    int[] actualResult = RemoveAllDuplicatesFromSortedArray.run(testData);
    if (actualResult.length != 0) {
      System.out.println("expect output is [] but actual output is " + Arrays.toString(actualResult));
      return false;
    }
    return true;
  }

  private static boolean happyCase5() {
    int[] expectedResult = new int[] { 1 };
    int[] actualResult = RemoveAllDuplicatesFromSortedArray.run(expectedResult);
    if (actualResult.length != 1 || actualResult[0] != 1) {
      System.out.println("expect output is [1] but actual output is " + Arrays.toString(actualResult));
      return false;
    }
    return true;
  }

  private static boolean happyCase6() {
    int[] testData = new int[] { 1, 1 };
    int[] expectedResult = new int[] { 1 };
    int[] actualResult = RemoveAllDuplicatesFromSortedArray.run(testData);
    for (int i = 0; i < expectedResult.length; i++) {
      if (expectedResult[i] != actualResult[i]) {
        System.out.println("expect output is [1] but actual output is " + Arrays.toString(actualResult));
        return false;
      }
    }
    return true;
  }

  private static boolean happyCase7() {
    int[] testData = new int[] { 1, 2, 3 };
    int[] expectedResult = new int[] { 1, 2, 3 };
    int[] actualResult = RemoveAllDuplicatesFromSortedArray.run(testData);
    for (int i = 0; i < expectedResult.length; i++) {
      if (expectedResult[i] != actualResult[i]) {
        System.out.println("expect output is [1,2,3] but actual output is " + Arrays.toString(actualResult));
        return false;
      }
    }
    return true;
  }

  private static boolean happyCase8() {
    int[] expectedResult = null;
    int[] actualResult = RemoveAllDuplicatesFromSortedArray.run(expectedResult);
    if (actualResult == null) {
      System.out.println("expect output is [] but actual output is null");
      return false;
    }
    if (actualResult.length != 0) {
      System.out.println("expect output is [] but actual output is " + Arrays.toString(actualResult));
      return false;
    }
    return true;
  }
}