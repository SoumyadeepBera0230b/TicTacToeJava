package com.tictactoegame;

import java.util.ArrayList;
import java.util.Arrays;

public class checkWinner {
    public static char winner(ArrayList<Integer> x, ArrayList<Integer> o) {
        ArrayList<Integer> case1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> case2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        ArrayList<Integer> case3 = new ArrayList<>(Arrays.asList(7, 8, 9));
        ArrayList<Integer> case4 = new ArrayList<>(Arrays.asList(1, 4, 7));
        ArrayList<Integer> case5 = new ArrayList<>(Arrays.asList(2, 5, 8));
        ArrayList<Integer> case6 = new ArrayList<>(Arrays.asList(3, 6, 9));
        ArrayList<Integer> case7 = new ArrayList<>(Arrays.asList(1, 5, 9));
        ArrayList<Integer> case8 = new ArrayList<>(Arrays.asList(3, 5, 7));
        if (x.containsAll(case1) || x.containsAll(case2) ||
            x.containsAll(case3) || x.containsAll(case4) ||
            x.containsAll(case5) || x.containsAll(case6) ||
            x.containsAll(case7) || x.containsAll(case8)) {
            return 'x';
        } else if(o.containsAll(case1) || o.containsAll(case2) ||
                o.containsAll(case3) || o.containsAll(case4) ||
                o.containsAll(case5) || o.containsAll(case6) ||
                o.containsAll(case7) || o.containsAll(case8)) {
            return 'o';
        }
        return ' ';
    }
}
