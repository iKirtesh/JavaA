import java.util.Scanner;

public class Employee {
    int empId;
    String name;
    double mobile;
    String address;
    String email;

    public Employee(){
        this.empId=0;
        this.name=null;
        this.mobile=0;
        this.address=null;
        this.email=null;
    }

    public Employee(int empId, String name, double mobile, String address, String email){

        super();
        this.empId = empId;
        this.name = name;
        this.mobile = mobile;
        this.address = address;
        this.email = email;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID :");
        this.empId = sc.nextInt();
        System.out.println("Enter Employee Name :");
        this.name = sc.next();
        System.out.println("Enter mobile number :");
        this.mobile = sc.nextDouble();
        System.out.println("Enter Email address :");
        this.email = sc.next();
        System.out.println("Enter address :");
        this.address = sc.next();
    }

    public void diplay(){

        System.out.println("Employee ID:" + empId);
        System.out.println("Employee Name:" + name);
        System.out.println("Mobile no.:" + mobile);
        System.out.println("Email ID:" + email);
        System.out.println("Address:" + address);

    }

    }


    public class ProjectManager extends Employee {
        double bp,da, hra, pf, club, net, gross, deduct;

        public ProjectManager(){
            this.bp = 0;
            this.da = 0;
            this.hra = 0;
            this.pf = 0;
            this.club = 0;
            this.net = 0;
            this.gross = 0;
            this.deduct = 0;
        }

        public ProjectManager(double bp, double da,double hra, double pf, double club, double net, double gross, double deduct){

            this.bp = bp;
            this.da = da;
            this.hra = hra;
            this.pf = pf;
            this.club = club;
            this.net = net;
            this.gross = gross;
            this.deduct = deduct;
        }

        public double getBasicPay(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter basic pay for Programmer :");
            bp = sc.nextDouble();
            return bp;
        }

        public void calculateSal(ProjectManager pm){
            double bp = pm.getBasicPay();

            da = 0.97*bp;
            hra = 0.10*bp;
            pf = 0.12*bp;
            club = 0.001*bp;
            gross = bp+da+hra;
            deduct = pf+club;
            net = gross - deduct;
        }

        public void displaySalslip(){
            System.out.println("\n\n ****PROJECTMANAGER SALARY SLIP****\n\n");

            this.diplay();
            System.out.println("Basic pay :" + this.bp);
            System.out.println("DA :" + this.da);
            System.out.println("HRA :" + this.hra);
            System.out.println("PF :" + this.pf);
            System.out.println("Staff club :" + this.club);
            System.out.println("\n Gross Salary :" + this.gross);
            System.out.println("\n Deduction in Salary :" + this.deduct);
            System.out.println("\n Net Salary :" + this.net);

        }
    }


public class AsstProjectManager extends Employee {
    double bp,da, hra, pf, club, net, gross, deduct;

    public AsstProjectManager(){
        this.bp = 0;
        this.da = 0;
        this.hra = 0;
        this.pf = 0;
        this.club = 0;
        this.net = 0;
        this.gross = 0;
        this.deduct = 0;
    }

    public AsstProjectManager(double bp, double da,double hra, double pf, double club, double net, double gross, double deduct){

        this.bp = bp;
        this.da = da;
        this.hra = hra;
        this.pf = pf;
        this.club = club;
        this.net = net;
        this.gross = gross;
        this.deduct = deduct;
    }

    public double getBasicPay(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic pay for Programmer :");
        bp = sc.nextDouble();
        return bp;
    }

    public void calculateSal(AsstProjectManager apm){
        double bp = apm.getBasicPay();

        da = 0.97*bp;
        hra = 0.10*bp;
        pf = 0.12*bp;
        club = 0.001*bp;
        gross = bp+da+hra;
        deduct = pf+club;
        net = gross - deduct;
    }

    public void displaySalslip(){
        System.out.println("\n\n ****AsstProjectManager SALARY SLIP****\n\n");

        this.diplay();
        System.out.println("Basic pay :" + this.bp);
        System.out.println("DA :" + this.da);
        System.out.println("HRA :" + this.hra);
        System.out.println("PF :" + this.pf);
        System.out.println("Staff club :" + this.club);
        System.out.println("\n Gross Salary :" + this.gross);
        System.out.println("\n Deduction in Salary :" + this.deduct);
        System.out.println("\n Net Salary :" + this.net);

    }
}
public class SalarySlip {
    public static void main(String[] args) {


        int m;
        char n;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("\n1.Asst.Project Manager \n2.Project Manager \n Enter your choice : ");
            m = input.nextInt();
            switch (m){
                case 1:
                    AsstProjectManager apm = new AsstProjectManager();
                    apm.input();
                    apm.calculateSal(apm);
                    apm.displaySalslip();
                    break;
                case 2:
                    ProjectManager pm = new ProjectManager();
                    pm.input();
                    pm.calculateSal(pm);
                    pm.displaySalslip();
                    break;

                default:
                    System.out.println("Wrong choice");
            }

            System.out.println("\nDo you want to continue- y\n :");
            n = input.next().charAt(0);
        }while (n=='y');

        System.out.println("Program Executed Successfully...");
    }
}

