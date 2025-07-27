package leetcode;

import leetcode.arrays.LongestCommonPrefix;

public class LeetCode {
    public static void main(String[] args){
        String[] listOfString = new String[]{"flower","flow","flight"};

        LongestCommonPrefix prefix = new LongestCommonPrefix();
        String result =  prefix.getLongestPrefix(listOfString);
        System.out.println("Longest common prefix" + result);

    }
}
