package baitap.bt4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        Fan fan1 = new Fan();
        if (!fan1.isOn()) {
            System.out.println("Nhap trang thai cua quat ?  (true/false)");
            boolean on = sc.nextBoolean();
            if (on) {
                System.out.println("Nhap toc do cua quat (1-SLOW, 2-MEDIUM, 3-FAST)");
                int speed = sc.nextInt();
                System.out.println("Nhap ban kinh cua quat");
                double radius = sc.nextDouble();
                sc.nextLine();
                System.out.println("Nhap mau sac cua quat");
                String color = sc.nextLine();
                Fan fan2 = new Fan(on , speed, radius,color) ;
                fan2.statusFan();
            } else {
                fan1.statusFan();
            }

        } else {
            fan1.statusFan();
        }

    }
}
