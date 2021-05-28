package jp.jll.loops.forloops;
/*
References:
  1. Writing and Running code in intelliJ: https://www.youtube.com/watch?v=H_XxH66lm3U
 */

public class c01_BasicFor {
    public static void main(String[] args) {
        int[] intArr = {6, 7, 8, 9};
        System.out.println("Basic for...v02...");
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(i + " : " + intArr[i]);
        }
    }
}
