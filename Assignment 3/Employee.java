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
















import java.util.Scanner;

public class Programmer extends Employee {

    double bp, da, hra, pf, club, net, gross, deduct;

    public Programmer() {
        this.bp = 0;
        this.da = 0;
        this.hra = 0;
        this.pf = 0;
        this.club = 0;
        this.net = 0;
        this.gross = 0;
        this.deduct = 0;
    }

    public Programmer(double bp, double da, double hra, double pf, double club, double net, double gross,
            double deduct) {
        super();
        this.bp = bp;
        this.da = da;
        this.hra = hra;
        this.pf = pf;
        this.club = club;
        this.net = net;
        this.gross = gross;
        this.deduct = deduct;
    }

    public double getBasicPay() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic Pay for Programmer : ");
        bp = sc.nextDouble();
        return bp;
    }

    public void calculateSal(Programmer p) {
        double bp = p.getBasicPay();

        da = 0.97 * bp;
        hra = 0.10 * bp;
        pf = 0.12 * bp;
        club = 0.001 * bp;
        gross = bp + da + hra;
        deduct = pf + club;
        net = gross - deduct;
    }

    public void displaySalslip() {
        System.out.println("\n \n **** PROGRAMMER SALARY SLIP ****\n\n");

        this.display();
        System.out.println("Basic Pay: " + bp);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Club: " + club);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Net Salary: " + net);
    }
}




import java.util.Scanner;

public class TeamLead extends Employee {

    double bp, da, hra, pf, club, net, gross, deduct;

    public TeamLead() {
        this.bp = 0;
        this.da = 0;
        this.hra = 0;
        this.pf = 0;
        this.club = 0;
        this.net = 0;
        this.gross = 0;
        this.deduct = 0;
    }

    public TeamLead(double bp, double da, double hra, double pf, double club, double net, double gross,
            double deduct) {
        super();
        this.bp = bp;
        this.da = da;
        this.hra = hra;
        this.pf = pf;
        this.club = club;
        this.net = net;
        this.gross = gross;
        this.deduct = deduct;
    }

    public double getBasicPay() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic Pay for Programmer : ");
        bp = sc.nextDouble();
        return bp;
    }

    public void calculateSal(TeamLead tl) {
        double bp = tl.getBasicPay();

        da = 0.97 * bp;
        hra = 0.10 * bp;
        pf = 0.12 * bp;
        club = 0.001 * bp;
        gross = bp + da + hra;
        deduct = pf + club;
        net = gross - deduct;
    }

    public void displaySalslip() {
        System.out.println("\n \n **** TEAM LEADER SALARY SLIP ****\n\n");

        this.display();
        System.out.println("Basic Pay: " + bp);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Club: " + club);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Net Salary: " + net);
    }
}



import java.util.Scanner;

public class ProjectManager extends Employee {

    double bp, da, hra, pf, club, net, gross, deduct;

    public ProjectManager() {
        this.bp = 0;
        this.da = 0;
        this.hra = 0;
        this.pf = 0;
        this.club = 0;
        this.net = 0;
        this.gross = 0;
        this.deduct = 0;
    }

    public ProjectManager(double bp, double da, double hra, double pf, double club, double net, double gross,
            double deduct) {
        super();
        this.bp = bp;
        this.da = da;
        this.hra = hra;
        this.pf = pf;
        this.club = club;
        this.net = net;
        this.gross = gross;
        this.deduct = deduct;
    }

    public double getBasicPay() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic Pay for Programmer : ");
        bp = sc.nextDouble();
        return bp;
    }

    public void calculateSal(ProjectManager pm) {
        double bp = pm.getBasicPay();

        da = 0.97 * bp;
        hra = 0.10 * bp;
        pf = 0.12 * bp;
        club = 0.001 * bp;
        gross = bp + da + hra;
        deduct = pf + club;
        net = gross - deduct;
    }

    public void displaySalslip() {
        System.out.println("\n \n **** PROJECT MANAGER SALARY SLIP ****\n\n");

        this.display();
        System.out.println("Basic Pay: " + bp);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Club: " + club);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Net Salary: " + net);
    }
}



import java.util.Scanner;

public class AsstProjectManager extends Employee {

    double bp, da, hra, pf, club, net, gross, deduct;

    public AsstProjectManager() {
        this.bp = 0;
        this.da = 0;
        this.hra = 0;
        this.pf = 0;
        this.club = 0;
        this.net = 0;
        this.gross = 0;
        this.deduct = 0;
    }

    public AsstProjectManager(double bp, double da, double hra, double pf, double club, double net, double gross,
            double deduct) {
        super();
        this.bp = bp;
        this.da = da;
        this.hra = hra;
        this.pf = pf;
        this.club = club;
        this.net = net;
        this.gross = gross;
        this.deduct = deduct;
    }

    public double getBasicPay() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic Pay for Programmer : ");
        bp = sc.nextDouble();
        return bp;
    }

    public void calculateSal(AsstProjectManager apm) {
        double bp = apm.getBasicPay();

        da = 0.97 * bp;
        hra = 0.10 * bp;
        pf = 0.12 * bp;
        club = 0.001 * bp;
        gross = bp + da + hra;
        deduct = pf + club;
        net = gross - deduct;
    }

    public void displaySalslip() {
        System.out.println("\n \n **** ASST PROJECT MANAGER SALARY SLIP ****\n\n");

        this.display();
        System.out.println("Basic Pay: " + bp);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Club: " + club);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Net Salary: " + net);
    }
}


import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        int m;
        int n;
        Scanner input = new Scanner(System.in);

        do {

            System.out.print(
                    "\n1. Programmer \n2. Team Leader \n3. Asst. Project Manager \n4. Project Manager \nEnter your choice: ");
            m = input.nextInt();
            switch (m) {

                case 1:
                    Programmer p = new Programmer();
                    p.Input();
                    p.display();
                    p.calculateSal(p);
                    p.displaySalslip();
                    break;

                case 2:
                    TeamLead tl = new TeamLead();
                    tl.Input();
                    tl.display();
                    tl.calculateSal(tl);
                    tl.displaySalslip();
                    break;

                case 3:
                    AsstProjectManager apm = new AsstProjectManager();
                    apm.Input();
                    apm.display();
                    apm.calculateSal(apm);
                    apm.displaySalslip();
                    break;

                case 4:
                    ProjectManager pm = new ProjectManager();
                    pm.Input();
                    pm.display();
                    pm.calculateSal(pm);
                    pm.displaySalslip();
                    break;

                default:

                    System.out.println("Invalid Choice");
                    break;
            }

            System.out.println("\nDo you want to continue? (y/n)");
            n = input.next().charAt(0);
        } while (n == 'y' || n == 'Y');
    }
}
