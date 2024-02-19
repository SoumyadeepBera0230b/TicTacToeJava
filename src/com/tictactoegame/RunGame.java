package com.tictactoegame;
import static com.tictactoegame.GameBoard.printBoard;

import java.util.*;

public class RunGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean play = true;
        while (play) {
            ArrayList<Integer> values = new ArrayList<>();
            ArrayList<Integer> xValues = new ArrayList<>();
            ArrayList<Integer> oValues = new ArrayList<>();

            char[] boardArr = new char[10];
            Arrays.fill(boardArr, ' ');
            int count = 1;
            boolean turn = true;
            char win = ' ';
            while (count != 10 && win == ' ') {
                gap(10);
                if (count == 1) System.out.println("Welcome to Soumyadeep's Tic Tac Toe game...");
                printBoard(boardArr);
                turn = checkWhosTurn(sc, turn, boardArr, values, xValues, oValues);

                win = checkWinner.winner(xValues, oValues);
                count += 1;
            }
            gap(10);
            printBoard(boardArr);
            if (win == 'x') System.out.println("X is the winner");
            else if (win == 'o') System.out.println("O is th winner");
            else System.out.println("Its a draw");
            System.out.println("Do you want to play again? Yes/No");
            String playAgain = sc.next().toLowerCase();
            play = (playAgain.equals("yes") ?true:false);
        }
        System.out.println("Thanks for playing :)");
    }

    private static boolean checkWhosTurn(Scanner sc,boolean turn, char[] arr, ArrayList<Integer> values, ArrayList<Integer> xValues, ArrayList<Integer> oValues) {
        int val;
        System.out.print((turn?"X":"O") + "'s turn: ");
        val = takeInput(sc, turn, values);
        values.add(val);

        if (turn) xValues.add(val);
        else oValues.add(val);
        arr[val-1] = turn?'X':'O';
        return turn?false:true;

    }


    private static int takeInput(Scanner sc, boolean turn, ArrayList<Integer> values) {
        Random random = new Random();
        int ip;
        ip = turn ? sc.nextInt() : (random.nextInt(10-1) + 1);


        while (ip < 1 || ip > 10 || contains(values, ip)) {
            System.out.println(turn?"Please enter the valid index for : X's turn":"");
            ip = turn ? sc.nextInt() : random.nextInt(10-1) + 1;
        }
        return ip;
    }

    private static boolean contains(ArrayList<Integer> arrayList, int value) {
        for (Integer i : arrayList) {
            if (i == value) return true;
        }
        return false;
    }

    private static void gap(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
        }
    }
}
