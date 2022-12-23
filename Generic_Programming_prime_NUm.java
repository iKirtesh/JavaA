public class Collection { 
    static int count = 0;
    static void even_odd(int x){
        if(x % 2 == 0){
            System.out.println(x + " IS EVEN");
            count += 1;
        }
        else{
            System.out.println(x + " IS ODD");
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
        switch (ch){
            case 1:
                even_odd(x);
                break;
            case 2:
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
        System.out.println("1. ODD or EVEN");
        System.out.println("2. PRIME or NOT");
        choice = sc.nextInt();
        Iterator itr = nums.iterator();
        count = 0;
        while(itr.hasNext()){
            check(choice,(int)itr.next());
        }
        SpreadBuilder num;
        if(choice == 1){
            System.out.println("The number of EVEN numbers are:" + count);
            System.out.println("The number of ODD numbers are:" + (nums.size()-count));
    }
        else{
            System.out.println("The number of Prime numbers are:" + count);
            System.out.println("The number of nonprime numbers are:" + (nums.size()-count));
        }

}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
    }
}

