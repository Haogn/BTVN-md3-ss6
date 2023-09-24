package baitap.bt6;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5] ;
        employees[0] = new Employee("RA01", "Nguyen SY Hoang", 25, true , 3.15) ;
        employees[1] = new Employee("RA02", "Nguyen Xuan Thanh", 25, true , 4.15) ;
        employees[2] = new Employee("RA03", "Nguyen Manh Thang", 25, true , 2.15) ;
        employees[3] = new Employee("RA04", "Ho Ngoc Tien", 25, true , 5.15) ;
        employees[4] = new Employee("RA05", "Dao Xuan Nam", 25, true , 2.15) ;

        for (int i = 0; i < employees.length; i++) {
            employees[i].calSalary();
            employees[i].display();
        }
    }
}
