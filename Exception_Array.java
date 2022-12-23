import java.util.Scanner;

public class ExceptionDemo {
    int num1,  num2, div;
    Scanner sc = new Scanner(System.in);

    public void divByzero(){
        System.out.println("Enter First Number :");
        num1 = Integer.parseInt(sc.next());

        System.out.println("Enter Second Number :");
        num2 = Integer.parseInt(sc.next());

        div = num1/num2;

        System.out.println("Result:" + div);
    }

    public void arrayIndexOutofBound(){
        int n;
        System.out.println("Enter Array Size :");
        n = sc.nextInt();

        int a[] = new int[n];

        for(int i=0; i<=n ;i++){
            System.out.println("Enter Element" + i +" :");
            a[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        ExceptionDemo d = new ExceptionDemo();

        try {
            d.divByzero();
            d.arrayIndexOutofBound();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound exception Occured:");
        }        
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception Occured");
        }
        System.out.println("Out of try-catch block...");
    }
}

