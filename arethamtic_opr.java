

import java.util.Scanner;
public class Complex_Op {
    public static void main(String[] args) {
        int ch = 0,m ;
        char n;

        float num1, num2, answer;

        Complex_Op cal = new Complex_Op();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number:\n");
        num1 = input.nextInt();
        num2 = input.nextInt();
        Complex_Op C1 = new Complex_Op(num1, num2);

        System.out.println("Enter the second number:\n");
        num1 = input.nextInt();
        num2 = input.nextInt();
        Complex_Op C2 = new Complex_Op(num1, num2);
   do{
            System.out.println("\nMENU:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nEnter your choice :");
            m = input.nextInt();
            switch (m){
                case 1 : cal.AddNumbers(C1,C2);
                    break;
                case 2 : cal.SubNumbers(C1,C2);
                    break;
                case 3 : cal.MulNumbers(C1,C2);
                    break;
                case 4 : cal.DivNumbers(C1,C2);
                    break;

            }
            System.out.println("\nDo you want to continue- y/n :");
            n = input.next().charAt(0);
        }while(n== 'y');

    }

    float real, imag;

    Complex_Op() {
        real = 0;
        imag = 0;
    }

    Complex_Op(float comp1, float comp2) {
        real = comp1;
        imag = comp2;

    }

    public void AddNumbers(Complex_Op c1, Complex_Op c2) {
        float real, imag;

        real = (c1.real + c2.real);
        imag = (c1.imag + c2.imag);

        System.out.println("Addition of the complex number is:" + real + " + " + imag + "i");
    }

    public void SubNumbers(Complex_Op c1, Complex_Op c2) {
        float real, imag;

        real = (c1.real - c2.real);
        imag = (c1.imag - c2.imag);

        System.out.println("Subtraction of the complex number is:" + real + " - " + imag + "i");
    }

    public void MulNumbers(Complex_Op c1, Complex_Op c2) {
        float real, imag;

        real = (c1.real * c2.real) - (c1.imag * c2.imag);
        imag = (c1.imag * c2.real) + (c1.real * c2.imag);

        System.out.println("Multiplication of the complex number is:" + real + " * " + imag + "i");
    }

    public void DivNumbers(Complex_Op c1, Complex_Op c2) {
        float real, imag;
        float den;
        den = c2.real * c2.real + c2.imag * c2.imag;

        real = ((c1.real * c2.real) + (c1.imag * c2.imag)) / den;
        imag = ((c1.imag * c2.real) - (c1.real * c2.imag)) / den;

        System.out.println("Division of the complex number is:" + real + " / " + imag + "i");


    }
}

