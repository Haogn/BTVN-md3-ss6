package baitap.bt5;

import java.sql.Struct;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[100];
        int countStu = 0;
        Student student1 = new Student(1, "Nguyen Sy Hoang", 25, true, "Ha Noi", "0352704999");
        Student student2 = new Student(2, "Pham Tuan Binh", 21, true, "Thai Binh", "0976811131");
        Student student3 = new Student(3, "An Thuy Linh", 27, false, "Hung Yen", "0355995757");
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        Scanner sc = new Scanner(System.in);
        int select;
        do {
            System.out.println("Menu chuc nang ");
            System.out.println("1. Hien thi danh sach sinh vien ");
            System.out.println("2. Them moi sinh vien");
            System.out.println("3. Sua thong tin sinh vien dua vao ma sinh vien");
            System.out.println("4. Xoa sinh vien ");
            System.out.println("5. ❌❌❌ Thoat chuong trinh");
            select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1:
                    for (Student val : students) {
                        if (val != null) {
                            val.printStudent();
                        } else {
                            System.out.println("Chua co sinh vien nao trong danh sach ");
                            break;
                        }
                    }
                    break;
                case 2:
                    // Tìm vị trí trống trong mảng students để thêm sinh viên mới
                    int emptyIndex = -1;
                    for (int i = 0; i < students.length; i++) {
                        if (students[i] == null) {
                            emptyIndex = i;
                            break;
                        }
                    }

                    if (emptyIndex != -1) {
                        // Tạo một đối tượng sinh viên mới và cho phép người dùng nhập thông tin
                        students[emptyIndex] = new Student();
                        students[emptyIndex].inputStudent(sc);
                        countStu++;
                        System.out.println("Thêm mới sinh viên thành công.");
                        students[emptyIndex].printStudent();
                    } else {
                        System.out.println("Danh sách sinh viên đã đầy, không thể thêm mới.");
                    }
                    break;
                case 3:
                    System.out.println("Nhap msv can sua thong tin ");
                    int id = Integer.parseInt(sc.nextLine());
                    boolean check = false;
                    for (Student value : students) {
                        if (value != null && value.getMsv() == id) {
                            value.editStudent(sc);
                            check = true;
                            break;
                        }
                    }
                    if (!check) {
                        System.out.println("Khong tim thay thong tin sinh vien can sua ");
                    }
                    System.out.println("Thong tin sinh vien sau khi sua ");
                    students[id - 1].printStudent();
                    break;

                case 4:
                    System.out.println("Nhap msv can xoa ");
                    int deleteId = Integer.parseInt(sc.nextLine());
                    boolean deleteStu = false ;
                    for (int i = 0; i < students.length; i++) {
                        if ( students[i] != null && students[i].getMsv() == deleteId) {
                            deleteStu = true ;
                            // xoa sinh vien bang cach dat gia tri bang null
                            students[i] = null ;
                            // di chuyen cac sinh vien sau khi xoa di sinh vien
                            for (int j = 0; j <students.length -1  ; j++) {
                                students[j] =students[j + 1] ;
                            }
                            students[students.length -1 ] = null ;
                            countStu-- ;
                            System.out.println("Da xoa thanh cong ");

                            break;
                        }
                    }
                    for (int i = 0; i <students.length ; i++) {
                        if ( students[i] != null) {
                            students[i].printStudent();
                        }
                    }
                    if (!deleteStu) {
                        System.out.println("Khong tm thay sinh vien can xoa ");
                    }

                    break;
                case 5:
                    System.out.println("🤞 Thoát chương trình ");
                    break;
            }
        } while (select != 5);
    }

    // hien thi danh sach sinh vien
    public void addNewStudent(Student[] students , Scanner sc, int countStu) {
        // tim ra vi tri con trong trong mang Student[]
        int emptyIndex = -1 ;
        for (int i = 0; i < students.length; i++) {
            if ( students[i] == null ) {
                emptyIndex = i ;
                break;
            }
        }
        // tien hanh them moi sinh vien
        if (emptyIndex != -1 ) {
            students[emptyIndex] = new Student() ;
            students[emptyIndex].inputStudent(sc);
            countStu++ ;
            System.out.println("Them moi sinh vien thanh cong");
            students[emptyIndex].printStudent();
        } else {
            System.out.println("Danh sach sinh vien da day , khong the them moi");
        }
    }
}
