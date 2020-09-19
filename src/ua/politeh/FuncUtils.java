package ua.politeh;

import java.util.Scanner;

public class FuncUtils {

    static double checkNum(Scanner in) {
        while (true) {
            String s = in.nextLine();
            try {
                return Double.parseDouble(s);
            } catch (NumberFormatException e) {
                System.out.println("Incorrect input, please try again!");
            }
        }
    }

    static void addTriangle(RightTriangles rightTriangles, Scanner in, double number) {
        for (int i = 0; i < number; i++) {

            System.out.println("Enter 1ft side of triangle");
            double side1 = FuncUtils.checkNum(in);

            System.out.println("Enter 2nd side of triangle");
            double side2 = FuncUtils.checkNum(in);

            System.out.println("Enter 3d side of triangle");
            double side3 = FuncUtils.checkNum(in);
            System.out.println("____________________________\n");

            rightTriangles.addTriangle(side1, side2, side3, i);
        }
    }


    static void addTriangle(Triangles triangles, Scanner in, double number) {
        for (int i = 0; i < number; i++) {

            System.out.println("Enter 1ft side of triangle");
            double side1 = FuncUtils.checkNum(in);

            System.out.println("Enter 2nd side of triangle");
            double side2 = FuncUtils.checkNum(in);

            System.out.println("Enter 3d side of triangle");
            double side3 = FuncUtils.checkNum(in);
            System.out.println("____________________________\n");

            triangles.addTriangle(side1, side2, side3, i);
        }
    }


}
