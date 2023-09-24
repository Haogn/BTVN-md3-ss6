package baitap.bt6;

import java.util.Scanner;

public class Employee {
    private String  employeeId ;

    private String employeeName ;
    private int age ;
    private boolean gender ;
    private double rate ;
    private double salary ;

    public Employee() {

    }

    public Employee(String  employeeId, String employeeName, int age, boolean gender, double rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gender = gender;
        this.rate = rate;
    }

    public void display() {
        System.out.println("______THONG TIN NHAN VIEN________\n" +
                        "Max nhan vien: " + employeeId + "\n" +
                        "Ten nhan vien: " + employeeName + "\n" +
                        "Tuoi: " + age + "\n" +
                        "Gioi tinh :  " + gender + "\n" +
                        "He so luong: " + rate + "\n" +
                        "Luong hien tai : " + salary + "VND");
    }

    public void inputData(Scanner sc) {
        System.out.println("Ma nhan vien ");
        int employeeId = Integer.parseInt(sc.nextLine());
        System.out.println("Ten nhaan vien ");
        String employeeName = sc.nextLine();
        System.out.println("Tuoi ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Gioi tinh ");
        boolean gender = Boolean.parseBoolean(sc.nextLine());
        System.out.println("He so luong ");
        double rate = sc.nextDouble();
    }
    public void calSalary() {
        this.salary = this.rate * 1300000 ;
    }
}
