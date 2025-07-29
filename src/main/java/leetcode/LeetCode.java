package leetcode;

import java.util.Arrays;
import leetcode.arrays.MergeSortedArray;

public class LeetCode {
    public static void main(String[] args){
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{};
        int m = 1;
        int n = 0;

        MergeSortedArray merge = new MergeSortedArray();
        int[] result = merge.getMergedArray(nums1, m, nums2, n);
        System.out.println("Is valid parenthesis: "+ Arrays.toString(result));
    }
}
