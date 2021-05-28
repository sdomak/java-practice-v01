package jp.problems.algoexp.easy;

import java.util.List;

public class c01__ValidateSubSequence {
    public static void main(String[] args) {
        List<Integer> array = List.of(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> subSequence = List.of(1, 6, -1, -1);
        System.out.println("c01__ValidateSubSequence ... v1");
        System.out.println("isValidSubSequence: " + isValidSubsequence(array, subSequence));
        System.out.println("isValidSubSequence2: " + isValidSubsequence2(array, subSequence));
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int indx = 0;
        int arrLen = array.size();
        for (int num : sequence) {
            if (indx == arrLen) {
                return false;
            }
            while (indx < arrLen) {
                if (num == array.get(indx)) {
                    ++indx;
                    break;
                }
                ++indx;
            }
        }
        return true;
    }

    //algo solution
    public static boolean isValidSubsequence2(List<Integer> array, List<Integer> sequence) {
        int arrldx = 0;
        int seqldx = 0;
        while (arrldx < array.size() && seqldx < sequence.size()) {
            if (array.get(arrldx).equals(sequence.get(seqldx))) {
                seqldx++;
            }
            arrldx++;
        }
        return seqldx == sequence.size();
    }

}
