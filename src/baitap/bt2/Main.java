package baitap.bt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        System.out.println("Phuong trin bac 2 co dang : ax^2 + bx + c = 0");
        System.out.println("Nhap so a = ");
        double a = sc.nextDouble();
        System.out.println("Nhap so b = ");
        double b = sc.nextDouble();
        System.out.println("Nhap so c = ");
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation1 = new QuadraticEquation(a, b, c);
        quadraticEquation1.giaiPhuongTrinhBacHai();
    }
}
