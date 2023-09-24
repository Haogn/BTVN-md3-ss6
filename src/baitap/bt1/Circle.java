package baitap.bt1;

public class Circle {
    double r ;
    final double Pi = 3.14;
    public Circle() {

    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double prerimeter() {
        return  Pi * r * 2;
    }

    public double acreage() {
        return Pi * Math.pow(r,2) ;
    }

}
