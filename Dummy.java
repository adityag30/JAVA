/*  Name - Aditya Kumar Garg
    Section - DS1
    University Roll No - 2023827
*/
import java.util.*;
public class Dummy {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice--(1- Term Deposit)(2- Recurring Deposit)");
        int ch = sc.nextInt();
        switch (ch)
        {
            case 1:
                System.out.println("Enter Principle Amount");
                double pa = sc.nextDouble();
                System.out.println("Enter rate of interest");
                double roi = sc.nextDouble();
                System.out.println("Enter the time period");
                int t = sc.nextInt();
                double res = pa*(1+(roi/100))*t;
                System.out.println("Maturity Amount="+ res);
                break;
            case 2:
                System.out.println("Enter Monthly Installment");
                double mi = sc.nextDouble();
                System.out.println("Enter rate of interest");
                double ri = sc.nextDouble();
                System.out.println("Enter the time period");
                double tp = sc.nextInt();
                double r = mi * tp + mi * tp*(tp-1)/2 * ri/100 * 1/12;
                System.out.println("Maturity Amount="+r);
                break;
            default:
                System.err.println("Wrong Choice");
                break;
        }

    }
}
