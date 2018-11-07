package com.getjavajob.training.algo.init.parakhins;

import java.lang.Math;
import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.StrictMath.sin;

public class TaskCh01N017 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        System.out.println(calculateExpresseionO(x));
        System.out.println(calculateExpresseionP(x, a, b, c));
        System.out.println(calculateExpresseionR(x));
        System.out.println(calculateExpresseionS(x));
    }

    public static double calculateExpresseionS(double x) {

        return abs(x) + abs(x + 1);
    }

    public static double calculateExpresseionR(double x) {

        return (sqrt(x + 1) + sqrt(x - 1)) / 2 * sqrt(x);
    }

    public static double calculateExpresseionP(double x, double a, double b, double c) {

        return sqrt(a * pow(x, 2) + (b * x) + c);
    }

    public static double calculateExpresseionO(double x) {

        return sqrt(1 - pow(sin(x), 2));
    }
}