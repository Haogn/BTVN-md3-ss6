package baitap.bt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhập vào Bán kính hình tròn");
        double r = sc.nextDouble();
        Circle circle1 = new Circle(r) ;

        System.out.println("Chu vi hinh tron = " + circle1.prerimeter() + "\n"
                        + "Diện tích hình trong = " + circle1.acreage());

    }
}
