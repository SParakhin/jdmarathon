package com.getjavajob.training.algo.init.parakhins;

import java.util.Scanner;

public class TaskCh02N031 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(getNumber(n));
    }

    public static int getNumber(int x) {

        if (x > 100 && x < 900) {
            return (100 * (x / 100) + 10 * (x % 10) + (x / 10) % 10);
        }
        return 0;
    }
}
