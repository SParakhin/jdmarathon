package com.getjavajob.training.algo.init.parakhins;

import java.util.Scanner;

public class TaskCh02N013 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.print(numRevers(x));
    }

    public static int numRevers(int x) {

        return (100 * (x % 10) + 10 * (x / 10 % 10) + x / 100);
    }
}
