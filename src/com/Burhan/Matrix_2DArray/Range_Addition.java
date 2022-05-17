package com.Burhan.Matrix_2DArray;

import java.util.Arrays;

public class Range_Addition {
    public static void main(String[] args) {
        int[][] queries = {
            {2, 6, 4},
            {0, 5, 3},
            {1, 4, -2},
            {6, 9, 1}
        };
        // int[][] queries = {
        //     {1, 3, 2},
        //     {2, 4, 3},
        //     {0, 2, -2}
        // };
        int length = 12;

        rangeAddition(queries, length);

    }

    static void rangeAddition(int[][] queries, int length) {
        int nRow = queries.length;
        int n = queries[nRow-1].length;
        int[] arr = new int[length];

        for (int i = 0; i < nRow; i++) {
            for (int j = queries[i][n-3]; j <= queries[i][n-2]; j++) {
                arr[j] = arr[j] + queries[i][n-1];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}