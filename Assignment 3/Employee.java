import java.util.Scanner;

public class Employee {

    int empId;
    String name;
    double mobile;
    String email;
    String address;

    public Employee() {
        this.empId = 0;
        this.name = null;
        this.mobile = 0;
        this.email = null;
        this.address = null;
    }

    public Employee(int empId, String name, double mobile, String address, String email) {
        super();
        this.empId = empId;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        empId = sc.nextInt();
        System.out.println("Enter Employee Name: ");
        name = sc.next();
        System.out.println("Enter Mobile No.: ");
        mobile = sc.nextDouble();
        System.out.println("Enter Email ID: ");
        email = sc.next();
        System.out.println("Enter Address: ");
        address = sc.next();
    }

    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Mobile No. : " + mobile);
        System.out.println("Email ID: " + email);
        System.out.println("Address: " + address);
    }
}