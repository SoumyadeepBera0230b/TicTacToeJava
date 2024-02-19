package com.tictactoegame;


public class GameBoard {
    public static void printBoard(char[] arr) {
        System.out.println("---------------------");
        System.out.println("      "+arr[0]+" | "+arr[1]+" | "+arr[2]+" ");
        System.out.println("     ---+---+---    ");
        System.out.println("      "+arr[3]+" | "+arr[4]+" | "+arr[5]+" ");
        System.out.println("     ---+---+---    ");
        System.out.println("      "+arr[6]+" | "+arr[7]+" | "+arr[8]+" ");
        System.out.println("---------------------");
    }
}
