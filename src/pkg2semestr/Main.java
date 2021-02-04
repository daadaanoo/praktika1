package pkg2semestr;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);

            System.out.print("Введите X(число):");
            double x = scan.nextDouble();
            System.out.print("Введите B (число, более нуля):");
            double a = scan.nextDouble();
            System.out.print("Введите D(число, более нуля):");
            double b = scan.nextDouble();
            double y;

            if (x > 4) {
                y = ( 4 * (Math.pow(a, 2)) + b * x) / ( b + x);
            } else {
                y = ( 3 * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(x, 2) + 2 * a* b + 2 * a* x + 2 * b * x ));
            }

            System.out.format("Y=%.3f", y);
            // System.out.print("Y="+y);
            System.out.println();
        } catch (Exception e) {
            System.out.println("Входные параметры заданы неверно!");
        }

    }
}