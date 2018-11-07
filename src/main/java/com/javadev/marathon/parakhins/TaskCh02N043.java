package com.getjavajob.training.algo.init.parakhins;

import java.util.Scanner;

import static java.lang.Math.abs;

public class TaskCh02N043 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(numDivision(a, b));
    }

    public static int numDivision(int a, int b) {

        return ((a == 0 | b == 0) ? 0 : abs((a % b) * (b % a) + 1));
    }

}
