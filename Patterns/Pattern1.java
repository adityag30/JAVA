
/*
    * * * * *----n
    * * * * *----n
    * * * * *----n
    * * * * *----n
    | | | | |
    | | | | |
    m m m m m
      n*m
      no. of rows * no. of columns
 */
import java.util.*;
public class Pattern1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        System.out.println("Enter number of columns");
        int m = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.print("\n");
        }
    }
}
