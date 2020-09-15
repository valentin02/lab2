package ua.politeh;

import lombok.Getter;


public class Triangle {

    @Getter private double[] side;

    public Triangle(double side0, double side1, double side2) {
        side = new double[3];
        this.side[0] = setSide(side0);
        this.side[1] = setSide(side1);
        this.side[2] = setSide(side2);
    }

    public double[] getSide() {
        return side;
    }

    public double setSide(double side) {
        return side > 0 ? side : 1;
    }

    public boolean isExists() {
        if(side[0] + side[1] > side[2] && side[0] + side[2] > side[1] && side[1] + side[2] > side[0]){return true;}
        return false;
    }

    public double getArea() {
        double p = getPerimeter() / 2; // half-perimeter
        return Math.sqrt(p * (p - this.side[0]) * (p - this.side[1]) * (p - this.side[2]));
    }

    public double getPerimeter(){
        return this.side[0] + this.side[1] + this.side[2];
    }

    public double[] getAngle(){
        double[] angles = new double[3];
        // cosA = (B^2 + C^2 - A^2) / 2*B*C
        angles[0] = Math.round( Math.toDegrees( Math.acos(( Math.pow(this.side[1], 2) + Math.pow(this.side[2], 2) - Math.pow(this.side[0], 2) ) / (2 * this.side[1] * this.side[2]))));
        angles[1] = Math.round(Math.toDegrees( Math.acos(( Math.pow(this.side[0], 2) + Math.pow(this.side[2], 2) - Math.pow(this.side[1], 2) ) / (2 * this.side[0] * this.side[2]))));
        angles[2] =Math.round( Math.toDegrees( Math.acos(( Math.pow(this.side[0], 2) + Math.pow(this.side[1], 2) - Math.pow(this.side[2], 2) ) / (2 * this.side[0] * this.side[1]))));

        return angles;
    }

    @Override
    public String toString() {
        double[] temp = this.getAngle();
        if(!this.isExists()) {return  "All data about this triangle aren't correct !\nTriangle with such sides doesn't exist \nSide1 = " + this.side[0] + "\nSide2 = " + this.side[1] + "\nSide3 = " + this.side[2];}
        return  "\nSide1 = " + this.side[0] + "\nSide2 = " + this.side[1] + "\nSide3 = " + this.side[2]
                + "\nAngle1 = " + temp[0] + "\nAngle2 = " + temp[1] + "\nAngle3 = " + temp[2]
                + "\nPerimeter = " + this.getPerimeter() + "\nArea of triangle = " + String.format("%2.2f" , this.getArea());

    }
}
