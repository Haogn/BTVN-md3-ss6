package baitap.bt5;

import java.util.Scanner;

public class Student {
    private  int msv ;
    private String nameStudent ;
    private int age ;
    private boolean gender ;
    private String address ;
    private String numberPhone ;

    public Student() {


    }

    public Student(String nameStudent, int age, boolean gender, String address, String numberPhone) {
        this.nameStudent = nameStudent;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.numberPhone = numberPhone;
    }

    public Student(int msv , String nameStudent, int age , boolean gender , String address, String numberPhone ){
        this.msv = msv ;
        this.nameStudent = nameStudent ;
        this.age= age ;
        this.gender= gender;
        this.address= address;
        this.numberPhone= numberPhone ;
    }

    public int getMsv() {
        return msv;
    }

    public void setMsv(int msv) {
        this.msv = msv;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }
    public void printStudent() {
        System.out.println("__________ THONG TIN SINH VIEN __________" + "\n" +
                            "Ma sinh vien : " + msv + "\n" +
                            "Ten sin vien : " + nameStudent + "\n" +
                            "Tuoi : " + age + "\n" +
                            "Gioi tinh : " + (gender?"Nam":"Nu") + "\n" +
                            "Dia chi : " + address + "\n" +
                            "So dien thoai : " + numberPhone + "\n"
                            );
    }

    public void inputStudent(Scanner sc  ) {
        System.out.println("Ma sinh vien ");
        msv = Integer.parseInt(sc.nextLine()) ;
        System.out.println("Ten sinh vien ");
        nameStudent = sc.nextLine();
        System.out.println("Tuoi ");
        age= Integer.parseInt(sc.nextLine()) ;
        System.out.println("Gioi tinh (Nam / Nu) ");
        boolean check = true ;
        while (check) {
            String sex = sc.nextLine();
            if (sex.equals("Nam")) {
                gender = true ;
                check = false ;
            } else if (sex.equals("Nu")) {
                gender = false ;
                check = false ;
            } else {
                System.out.println("Khong nhan ket qua nay ");
                System.out.println("Nhap lai gioi tinh ");
            }
        }

        System.out.println("Dia chi ");
        address = sc.nextLine();
        System.out.println("So dien thoai");
        numberPhone = sc.nextLine();
    }

    public void editStudent( Scanner sc ) {
        System.out.println("Ten sinh vien ");
        nameStudent = sc.nextLine();
        System.out.println("Tuoi ");
        age= Integer.parseInt(sc.nextLine()) ;
        System.out.println("Gioi tinh (Nam / Nu) ");
        boolean check = true ;
        while (check) {
            String sex = sc.nextLine();
            if (sex.equals("Nam")) {
                gender = true ;
                check = false ;
            } else if (sex.equals("Nu")) {
                gender = false ;
                check = false ;
            } else {
                System.out.println("Khong nhan ket qua nay ");
                System.out.println("Nhap lai gioi tinh ");
            }
        }

        System.out.println("Dia chi ");
        address = sc.nextLine();
        System.out.println("So dien thoai");
        numberPhone = sc.nextLine();
    }


}
