package ua.politeh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("\nENTER QUANTITY OF TRIANGLES");
        byte numberTriangles = (byte) FuncUtils.checkNum(in);
        numberTriangles = numberTriangles > 0 ? numberTriangles : 1;
        Triangle[] triangles = new Triangle[numberTriangles];
        FuncUtils.addTriangle(triangles, in);

        System.out.println("ENTER QUANTITY OF RIGHT TRIANGLES");
        byte numberRightTriangles = (byte) FuncUtils.checkNum(in);
        numberRightTriangles = numberRightTriangles > 0 ? numberRightTriangles : 1;
        RightTriangle[] rightTriangles = new RightTriangle[numberRightTriangles];
        FuncUtils.addTriangle(rightTriangles, in);

        FuncUtils.toStringTriangle(triangles);
        FuncUtils.toStringTriangle(rightTriangles);
        System.out.println("\nAVERAGE AREA OF TRIANGLE = " + String.format("%2.2f", FuncUtils.averageAreaTriangle(FuncUtils.areaTriangle(triangles))));
        System.out.println("\nTHE LONGEST HYPOTHENUSES OF RIGHT TRIANGLES = " + FuncUtils.longerSideRightTriangle(FuncUtils.sideRightTriangle(rightTriangles)));

    }



}

