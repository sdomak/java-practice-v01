package jp.jll.loops.forloops;

import java.util.List;

public class c03_ForEachConstruct {
    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        System.out.println("forEach Construct...");
        intList.forEach( val -> {
                    System.out.println(val);
                }
        );
    }
}
