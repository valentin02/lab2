package ua.politeh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("\nENTER QUANTITY OF TRIANGLES");
        byte numberTriangles = (byte) checkNum(in);
        numberTriangles = numberTriangles > 0 ? numberTriangles : 1;
        Triangle[] triangles = new Triangle[numberTriangles];
        addTriangle(triangles, in);

        System.out.println("ENTER QUANTITY OF RIGHT TRIANGLES");
        byte numberRightTriangles = (byte) checkNum(in);
        numberRightTriangles = numberRightTriangles > 0 ? numberRightTriangles : 1;
        RightTriangle[] rightTriangles = new RightTriangle[numberRightTriangles];
        addTriangle(rightTriangles, in);

        toStringTriangle(triangles);
        toStringTriangle(rightTriangles);
        System.out.println("\nAVERAGE AREA OF TRIANGLE = " + String.format("%2.2f", averageAreaTriangle(areaTriangle(triangles))));
        System.out.println("\nTHE LONGEST HYPOTHENUSES OF RIGHT TRIANGLES = " + longerSideRightTriangle(sideRightTriangle(rightTriangles)));

    }

    static void toStringTriangle(Triangle[] triangles) {

        for (int i = 0; i < triangles.length; i++) {
            System.out.println("\nTriangle #" + ++i + "\n" + triangles[--i].toString() + "\n_________________________");
        }
    }

    static void toStringTriangle(RightTriangle[] rightTriangles) {

        for (int i = 0; i < rightTriangles.length; i++) {
            System.out.println("\nRight triangle #" + ++i + "\n" + rightTriangles[--i].toString() + "\n_________________________");
        }
    }


    public static double[] areaTriangle(Triangle[] triangles) {

        double[] areaTriangle = new double[triangles.length];
        for (int i = 0; i < triangles.length; i++) {
            areaTriangle[i] = triangles[i].getArea();
        }
        return areaTriangle;
    }

    public static double averageAreaTriangle(double[] areaTriangle) {
        double temp = 0;
        byte x = 0;
        for (int i = 0; i < areaTriangle.length; i++) {
            if (areaTriangle[i] > 0) {
                temp += areaTriangle[i];
                x++;
            }
        }
        if (temp > 0) return temp / (double) x;
        else return -1;
    }

    public static double[] sideRightTriangle(RightTriangle[] rightTriangles) {

        double[] sideRightTriangle = new double[rightTriangles.length];

        for (int i = 0; i < sideRightTriangle.length; i++) {
            if (rightTriangles[i].isExists())
                sideRightTriangle[i] = longerSideRightTriangle(rightTriangles[i].getSide());
            else sideRightTriangle[i] = 0;
        }
        return sideRightTriangle;
    }

    private static double longerSideRightTriangle(double[] side) {

        double temp = 0;
        for (int i = 0; i < side.length; i++) {
            if (side[i] > temp) temp = side[i];
        }
        return temp;
    }


    static double checkNum(Scanner in) {

        while (true) {

            String s = in.nextLine();

            try {
                //double a = Double.parseDouble(s);
                return Double.parseDouble(s);

            } catch (NumberFormatException e) {
                System.out.println("Incorrect input, please try again!");
            }
        }
    }

    static void addTriangle(Triangle[] triangles, Scanner in) {

        for (int i = 0; i < triangles.length; i++) {

            System.out.println("Enter 1ft side of triangle");
            double side1 = checkNum(in);

            System.out.println("Enter 2nd side of triangle");
            double side2 = checkNum(in);

            System.out.println("Enter 3d side of triangle");
            double side3 = checkNum(in);
            System.out.println("____________________________\n");
            triangles[i] = new Triangle(side1, side2, side3);

        }

    }

    static void addTriangle(RightTriangle[] rightTriangles, Scanner in) {

        for (int i = 0; i < rightTriangles.length; i++) {

            System.out.println("Enter 1ft side of triangle");
            double side1 = checkNum(in);

            System.out.println("Enter 2nd side of triangle");
            double side2 = checkNum(in);

            System.out.println("Enter 3d side of triangle");
            double side3 = checkNum(in);
            System.out.println("____________________________\n");
            rightTriangles[i] = new RightTriangle(side1, side2, side3);

        }

    }

}

