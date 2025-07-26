package dsa;

import dsa.sorting.MergeSort;
import java.util.Arrays;

public class DSA {
    public static void main(String[] args){
        int[] unsortedNums = new int[]{9,1,7,20,2};

        MergeSort merge = new MergeSort();
        int[] result = merge.sortUsingMerge(unsortedNums);
        System.out.printf("Merge sort result is %s\n", Arrays.toString(result));
    }
}
