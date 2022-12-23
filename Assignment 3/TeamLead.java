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
