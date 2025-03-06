/*
    Fibonacci Series --
            0 1 1 2 3 5 8 13 21 34 _ _ _ _ _
            logic-> 0+1->1+1->2+1->3+2->5_ _ _ _
 */
import java.util.*;
public class Function6 {
    public static void fibonacci(int n){
        int a=0,b=1;
        System.out.println(a+" ");
        for(int i=2;i<=n;i++){
            System.out.println(b+" ");
            int temp=b;
            b=a+b;
            a=temp;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the n till which we can print fibonacci series-");
        int n = sc.nextInt();
        fibonacci(n);

    }
}
