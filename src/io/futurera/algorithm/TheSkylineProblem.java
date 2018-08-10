package io.futurera.algorithm;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class TheSkylineProblem {

    public static List<int[]> getSkyline(int[][] buildings) {
        return new ArrayList<int[]>();
    }
    
    /**********************************************************************
     *                                                                    *
     * Below are to test your codes. DO NOT LOOK WHEN YOU ARE CODING!     *
     *                                                                    *
     **********************************************************************/

    public static void main(String[] args) {

        test(new int[][] { { 2, 9, 10 }, { 3, 7, 15 }, { 5, 12, 12 }, { 15, 20, 10 }, { 19, 24, 8 } },
                new int[][] { { 2, 10 }, { 3, 15 }, { 7, 12 }, { 12, 0 }, { 15, 10 }, { 20, 8 }, { 24, 0 } });

        test(new int[][] { { 0, 2, 3 }, { 2, 5, 3 } }, new int[][] { { 0, 3 }, { 5, 0 } });

        test(new int[][] { { 0, 5, 10 }, { 5, 10, 5 }, { 10, 15, 5 } }, new int[][] { { 0, 10 }, { 5, 5 }, { 15, 0 } });

        System.out.println("--------------------\nTest DONE");
    }

    private static void test(int[][] buildings, int[][] expected) {
        List<int[]> result = getSkyline(buildings);
        for (int i = 0; i < Math.min(result.size(), expected.length); i++) {
            for (int j = 0; j < 2; j++) {
                if (result.get(i)[j] != expected[i][j]) {
                    System.out.println("\n[TEST FAILED]\nInput:" + arrayToString(buildings) + "\nExpected :"
                            + arrayToString(expected) + "\nActual: " + arrayToString(result));
                    return;
                }
            }
        }
    }

    private static String arrayToString(int[][] array) {
        StringBuilder builder = new StringBuilder();
        builder.append('[');
        for (int[] row : array) {
            builder.append(Arrays.toString(row));
            builder.append(',');
        }
        builder.setLength(builder.length() - 1);
        builder.append(']');
        return builder.toString();
    }

    private static String arrayToString(List<int[]> list) {
        int[][] array = new int[list.size()][list.get(0).length];
        array = list.toArray(array);
        return arrayToString(array);
    }
}