package io.futurera.algorithm;

import java.util.Arrays;

public class RemoveFirstDuplicatesFromSortedArray {
	
	public int[] removeDuplicates(int[] nums) {
		return new int[]{};
	}
	
	public static void main(String[] args) {
		RemoveFirstDuplicatesFromSortedArray rfdfsa = new RemoveFirstDuplicatesFromSortedArray();
		rfdfsa.happyCase1();
		rfdfsa.happyCase2();
		rfdfsa.happyCase3();
		rfdfsa.happyCase4();
		rfdfsa.happyCase5();
		rfdfsa.happyCase6();
		rfdfsa.happyCase7();
		rfdfsa.happyCase8();
		System.out.println("test case completed.");
	}
	
	private boolean happyCase1() {
		int[] testData = new int[]{1,2,2,3};
		int[] expectedResult = new int[]{1,2,3};
		int[] actualResult = removeDuplicates(testData);
		for(int i = 0; i < expectedResult.length; i++) {
			if (expectedResult[i] != actualResult[i]) {
				System.out.println("expect output is [1,2,3] but actual output is " + Arrays.toString(actualResult));
				return false;
			}
		}
		return true;
	}
	
	private boolean happyCase2() {
		int[] testData = new int[]{1,2,2,2,3};
		int[] expectedResult = new int[]{1,2,3};
		int[] actualResult = removeDuplicates(testData);
		for(int i = 0; i < expectedResult.length; i++) {
			if (expectedResult[i] != actualResult[i]) {
				System.out.println("expect output is [1,2,2,3] but actual output is " + Arrays.toString(actualResult));
				return false;
			}
		}
		return true;
	}
	
	private boolean happyCase3() {
		int[] testData = new int[]{1,2,2,3,3};
		int[] expectedResult = new int[]{1,2,3};
		int[] actualResult = removeDuplicates(testData);
		for(int i = 0; i < expectedResult.length; i++) {
			if (expectedResult[i] != actualResult[i]) {
				System.out.println("expect output is [1,2,3] but actual output is " + Arrays.toString(actualResult));
				return false;
			}
		}
		return true;
	}
	
	private boolean happyCase4() {
		int[] testData = new int[]{};
		int[] actualResult = removeDuplicates(testData);
		if (actualResult.length != 0) {
			System.out.println("expect output is [] but actual output is " + Arrays.toString(actualResult));
			return false;
		}
		return true;
	}

	private boolean happyCase5() {
		int[] expectedResult = new int[]{1};
		int[] actualResult = removeDuplicates(expectedResult);
		if (actualResult.length != 1 || actualResult[0] != 1) {
			System.out.println("expect output is [1] but actual output is " + Arrays.toString(actualResult));
			return false;
		}
		return true;
	}
	
	private boolean happyCase6() {
		int[] testData = new int[]{1,1};
		int[] expectedResult = new int[]{1};
		int[] actualResult = removeDuplicates(testData);
		for(int i = 0; i < expectedResult.length; i++) {
			if (expectedResult[i] != actualResult[i]) {
				System.out.println("expect output is [1] but actual output is " + Arrays.toString(actualResult));
				return false;
			}
		}
		return true;
	}
	
	private boolean happyCase7() {
		int[] testData = new int[]{1,2,3};
		int[] expectedResult = new int[]{1,2,3};
		int[] actualResult = removeDuplicates(testData);
		for(int i = 0; i < expectedResult.length; i++) {
			if (expectedResult[i] != actualResult[i]) {
				System.out.println("expect output is [1,2,3] but actual output is " + Arrays.toString(actualResult));
				return false;
			}
		}
		return true;
	}
	
	private boolean happyCase8() {
		int[] expectedResult = null;
		int[] actualResult = removeDuplicates(expectedResult);
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
