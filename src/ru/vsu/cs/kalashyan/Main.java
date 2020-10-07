package ru.vsu.cs.kalashyan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);

        double a = scanDouble("a", task);
        double b = scanDouble("b", task);
        double c = scanDouble("c", task);

        try {
            EquationRoot result = findRootsQuadraticEquation(a, b, c);
            System.out.println(" Answer x1 = " + result.x1);
            System.out.println(" Answer x2 = " + result.x2);
        } catch (Exception e) {
            System.out.println(" No roots ");
        }
    }

    public static double scanDouble(String name, Scanner scn) {
        System.out.print(" Entered value " + name + ": ");
        return scn.nextDouble();
    }

    public static EquationRoot findRootsQuadraticEquation(double a, double b, double c) throws Exception {
        double d = (Math.pow(b, 2) - 4 * a * c);
        if (d >= 0) {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            return new EquationRoot(x1, x2);
        } else {
            throw new Exception(" Discriminant less than 0 ");
        }
    }
}