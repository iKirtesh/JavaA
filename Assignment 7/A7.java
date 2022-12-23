import java.util.*;

public class A7 {
    static int count = 0; // Count Varibale

    // Function to check palindrome
    static void check_palindrome(String x) {
        StringBuilder s1 = new StringBuilder(x);
        if (x.equals(s1.reverse().toString())) {
            System.out.println(x + " is Palindrome");
            count++;
        } else {
            System.out.println(x + " is Not Palindrome");
        }
    }

    // Function to check even or odd
    static void check_even_odd(int x) {
        if (x % 2 == 0) {
            System.out.println(x + " is Even");
            count++;
        } else {
            System.out.println(x + " is Odd");
        }
    }

    // Function to check prime or not
    static void check_prime(int x) {
        boolean flag = false;
        for (int i = 2; i <= x / 2; ++i) {
            if (x % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(x + " is Prime");
            count++;
        } else {
            System.out.println(x + " is Not Prime");
        }
    }

    // Function to Decide which is function to checl
    static void check(int ch, int x) {
        switch (ch) {
            case 1:
                check_even_odd(x);
                break;
            case 2:
                check_prime(x);
                break;
            default:
                System.out.println("Enter correct option !");
        }
    }

    // Function for integer array
    static void number_op() {
        int element, n, choice;
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<Integer>();
        System.out.print("Enter the Size of Array: ");
        n = sc.nextInt();
        System.out.print("Enter the elements: ");

        for (int i = 0; i < n; i++) {
            element = sc.nextInt();
            nums.add(element);
        }

        System.out.println("Enter the operation to be performed: ");
        System.out.println("1. Odd or Even");
        System.out.println("2. Prime or Not");
        choice = sc.nextInt();

        Iterator itr = nums.iterator();

        while (itr.hasNext()) {
            check(choice, (int) itr.next());
        }

        if (choice == 1) {
            System.out.println("The number of Even number is : " + count);
            System.out.println("The number of Odd number is : " + (nums.size() - count));
        }
        if (choice == 2) {
            System.out.println("The number of Prime number is : " + count);
            System.out.println("The number of Not Prime number is : " + (nums.size() - count));
        }
    }

    // Function for String array
    static void string_op() {
        int n;
        String word;
        Scanner sc = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<String>();
        System.out.print("Enter the Size of array : ");
        n = sc.nextInt();
        System.out.print("Enter the elements: ");

        for (int i = 0; i < n; i++) {
            word = sc.next();
            words.add(word);
        }

        for (String str : words) {
            check_palindrome(str);
        }

        System.out.println("The number of Palindrome is : " + count);
    }

    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the type of array: ");
        System.out.println("1. Integer");
        System.out.println("2. String");
        System.out.println();

        System.out.print("Your Choice is : ");
        ch = sc.nextInt();

        if (ch == 2) {
            number_op();
        } else {
            string_op();
        }
    }
}