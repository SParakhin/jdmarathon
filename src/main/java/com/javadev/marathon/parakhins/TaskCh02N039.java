package com.getjavajob.training.algo.init.parakhins;

import java.util.Scanner;

public class TaskCh02N039 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();
        System.out.println(getAngle(h, m, s));
    }

    public static double getAngle(double h, double m, double s) {

        h %= 12;
        s += (h * 3600) + (m * 60);
        return (360 * s / 12 / 3600);
    }
}

