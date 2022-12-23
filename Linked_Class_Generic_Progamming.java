import kotlin.jvm.internal.SpreadBuilder;

import java.util.*;
import java.lang.*;
import java.io.*;

public class A7 { 
    static int count = 0;
    static void check_palindrome(String x){
        StringBuilder s1 = new StringBuilder(x);
        if(x.equals(s1.reverse().toString())){
            System.out.println(x + " is a Palindrome");
            count += 1;
        }
        else{
            System.out.println(x + "is not a Palindrome");
        }
    }
    
    static void prime(int x){
        boolean flag = false;
        for(int i=2; i<=x/2; i++){
            if(x % i == 0){
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println(x + " is a prime number");
            count += 1;
        }
        else{
            System.out.println(x + "is not a prime number");
        }
    }
    static void check(int ch, int x){
               case 1:
               prime(x);
                break;
            default:
                System.out.println("ENTER THE CORRECT OPTION");
        }
    }
    static void number_op(){
        int element,n,choice;
        Scanner sc =  new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        System.out.println("Enter the number of elements");
        n = sc.nextInt();
        System.out.println("Enter the elements:");

        for(int i=0; i<n; i++){
            element = sc.nextInt();
            nums.add(element);
        }
        System.out.println("Enter the operation to be performed:");
        System.out.println("2. PRIME or NOT");
        choice = sc.nextInt();
        Iterator itr = nums.iterator();
        count = 0;
        while(itr.hasNext()){
            check(choice,(int)itr.next());
        }
        SpreadBuilder num;
        
            System.out.println("The number of Prime numbers are:" + count);
            System.out.println("The number of nonprime numbers are:" + (nums.size()-count));

}
static void string_op(){
        int n;
        String word;

        ArrayList<String>words = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0; i<n; i++){
            word = sc.next();
            words.add(word);
        }
        count = 0;
        for(String w:words){
            check_palindrome(w);
        }
    System.out.println("The number of palindrome is:" + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose type:");
        System.out.println("1. String");
        System.out.println("2. Integer");
        int ch = sc.nextInt();
        if(ch == 2)
            number_op();
        else
            string_op();
    }
}


