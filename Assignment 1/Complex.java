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






public class ComplexNum {

    float real, imag;

    ComplexNum() {
        real = 0;
        imag = 0;
    }

    ComplexNum(float comp1, float comp2) {
        real = comp1;
        imag = comp2;
    }

    // for addition
    public void AddNumbers(ComplexNum c1, ComplexNum c2) {
        float real, imag;

        real = (c1.real + c2.real);
        imag = (c1.imag + c2.imag);

        System.out.println("Sum of complex numbers is: " + real + " + " + imag + "i");

    }

    // for subtraction
    public void SubNumbers(ComplexNum c1, ComplexNum c2) {
        float real, imag;

        real = (c1.real - c2.real);
        imag = (c1.imag - c2.imag);

        System.out.println("Difference of complex numbers is: " + real + " + " + imag + "i");

    }

    // for multiplican
    public void MulNumbers(ComplexNum c1, ComplexNum c2) {
        float real, imag;

        real = (c1.real * c2.real) - (c1.imag * c2.imag);
        imag = (c1.imag * c2.real) + (c1.real * c2.imag);

        System.out.println("Multiplication of the complex number is:" + real + " * " + imag + "i");
    }

    // for division
    public void DivNumbers(ComplexNum c1, ComplexNum c2) {
        float real, imag;
        float den;
        den = c2.real * c2.real + c2.imag * c2.imag;

        real = ((c1.real * c2.real) + (c1.imag * c2.imag)) / den;
        imag = ((c1.imag * c2.real) - (c1.real * c2.imag)) / den;

        System.out.println("Division of the complex number is:" + real + " / " + imag + "i");

    }
}
