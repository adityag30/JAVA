/*  Name - Aditya Kumar Garg
    Section - DS1
    University Roll No - 2023827
*/
import java.util.*;
public class Demo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=num1;i++)
        {
            if(num1 % i==0)
            {
                sum1+=i;
            }
        }
        for(int i=1;i<=num2;i++)
        {
            if(num2 % i==0)
            {
                sum2+=i;
            }
        }
        if(sum1/num1 == sum2/num2)
        {
            System.out.println("Friendly pair");
        }
        else {
            System.out.println("Not Friendly Pair");
        }
    }
}
