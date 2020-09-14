package ua.politeh;

import lombok.Getter;

public class Triangle {

    @Getter private double[] side;

    public Triangle(double side0, double side1, double side2) {
        this.side[0] = setSide(side0);
        this.side[1] = setSide(side1);
        this.side[2] = setSide(side2);
    }

    public double setSide(double side) {
         return side > 0 ? side : 1;
    }
}
