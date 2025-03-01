import java.util.*;
public class Function2 {
    public static int factorial(int n){
        /*
                with recursion
                        if(n==0){
                            return 1;
                        }
                        else if(n==1){
                            return 1;
                        }
                        else{
                            return n*factorial(n-1);
                        }
        */
        // Without Recursion
        int factorial=1;
        for(int i=n;i>=1;i--)
        {
            factorial*=i;
        }
        return factorial;

    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number--");
        int a = sc.nextInt();
        System.out.println("Factorial of "+a+" is "+factorial(a));

    }
}

