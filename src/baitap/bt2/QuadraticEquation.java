package baitap.bt2;

public class QuadraticEquation {
    // giải phương trình bậc 2 có dạng ax^2 + bx + c = 0
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    public void giaiPhuongTrinhBacHai() {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                System.out.println("phuong trinh co 1 nghiem duy nhat x =" + (-c / a));
            }
        } else {
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                System.out.println("Phuong trinh co nghiem kep x = " + -b / (2 * a));
            } else {
                double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
                double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phan biet " + " x1 = " + x1 + " x2 = " + x2);
            }
        }
    }
}
