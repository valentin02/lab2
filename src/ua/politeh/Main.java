package ua.politeh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("\nENTER QUANTITY OF TRIANGLES");
        byte numberTriangles = (byte) FuncUtils.checkNum(in);
        numberTriangles = numberTriangles > 0 ? numberTriangles : 1;
        Triangles triangles = new Triangles(numberTriangles);
        FuncUtils.addTriangle(triangles, in, numberTriangles);

        System.out.println("ENTER QUANTITY OF RIGHT TRIANGLES");
        byte numberRightTriangles = (byte) FuncUtils.checkNum(in);
        numberRightTriangles = numberRightTriangles > 0 ? numberRightTriangles : 1;
        RightTriangles rightTriangles = new RightTriangles(numberRightTriangles);
        FuncUtils.addTriangle(rightTriangles, in, numberRightTriangles);

        System.out.println(triangles);
        System.out.println(rightTriangles);
        System.out.println(triangles.printResult());
        System.out.println(rightTriangles.printResult());
    }



}

