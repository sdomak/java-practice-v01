package jp.jll.utils.arrays;

public class c01_LoopingThroughAnArray {
    public static void main(String[] args) {
        int[] intArr = {6, 7, 8, 9};
        System.out.println("Looping Through an Array...v01...");
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(i + " : " + intArr[i]);
        }
    }
}
