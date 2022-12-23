import java.util.Scanner;

public class ExceptionDemo {
    int num1, num2, div;
    Scanner input = new Scanner(System.in);

    public void divByZero() {
        System.out.print("Enter two numbers: ");
        num1 = Integer.parseInt(input.next());
        num2 = Integer.parseInt(input.next());
        div = num1 / num2;
        System.out.println("The result is: " + div);
    }

    public void arrayIndexOutOfBound() {
        int n;
        System.out.print("Enter the size of the array: ");
        n = input.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i <= n; i++) {
            arr[i] = input.nextInt();
        }
    }

    public static void main(String[] args) {
        ExceptionDemo d = new ExceptionDemo();

        try {
            d.divByZero();
            d.arrayIndexOutOfBound();
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound exception");
        }

        catch (NumberFormatException e) {
            System.out.println("Number format exception occurred");
        }

        catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        }

        catch (Exception e) {
            System.out.println("Exception occurred");
        }
        System.out.println("Out of try-catch block...");
    }
}