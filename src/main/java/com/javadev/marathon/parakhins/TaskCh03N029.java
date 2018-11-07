package com.getjavajob.training.algo.init.parakhins;

import java.util.Scanner;

public class TaskCh03N029 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        System.out.println(getExpressionA(x, y));
        System.out.println(getExpressionB(x, y));
        System.out.println(getExpressionC(x, y));
        System.out.println(getExpressionD(x, y, z));
        System.out.println(getExpressionE(x, y, z));
        System.out.println(getExpressionF(x, y, z));
    }

    public static boolean getExpressionA(int x, int y) {

        return x % 2 != 0 && y % 2 != 0;
    }

    public static boolean getExpressionB(int x, int y) {

        return (x < 20 && y >= 20) || (x >= 20 && y < 20);
    }

    public static boolean getExpressionC(int x, int y) {

        return x == 0 || y == 0;
    }

    public static boolean getExpressionD(int x, int y, int z) {

        return x < 0 && y < 0 && z < 0;
    }

    public static boolean getExpressionE(int x, int y, int z) {

        return (x % 5 == 0 && y % 5 != 0 && z % 5 != 0)
                || (x % 5 != 0 && y % 5 == 0 && z % 5 != 0)
                || (x % 5 != 0 && y % 5 != 0 && z % 5 == 0);
    }

    public static boolean getExpressionF(int x, int y, int z) {

        return x > 100 || y > 100 || z > 100;
    }
}
