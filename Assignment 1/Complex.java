import java.util.Scanner;

public class Complex {
    public static void main(String[] args) {
        int m;
        char n;
        float num1, num2;

        ComplexNum cal = new ComplexNum();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = input.nextFloat();
        System.out.print("Enter the second number: ");
        num2 = input.nextFloat();

        ComplexNum object1 = new ComplexNum(num1, num2);

        System.out.print("Enter the first number: ");
        num1 = input.nextFloat();
        System.out.print("Enter the second number: ");
        num2 = input.nextFloat();

        ComplexNum object2 = new ComplexNum(num1, num2);

        do {
            System.out.println("\nMENU:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nEnter your choice :");
            m = input.nextInt();
            switch (m) {
                case 1:
                    cal.AddNumbers(object1, object2);
                    break;
                case 2:
                    cal.SubNumbers(object1, object2);
                    break;
                case 3:
                    cal.MulNumbers(object1, object2);
                    break;
                case 4:
                    cal.DivNumbers(object1, object2);
                    break;

            }
            System.out.println("\nDo you want to continue- y/n :");
            n = input.next().charAt(0);
        } while (n == 'y');
    }
}
