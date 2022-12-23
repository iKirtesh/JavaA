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
