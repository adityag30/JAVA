/*                                  first half       spaces       second half
    *             *                     1               6               1
    * *         * *                     2               4               2
    * * *     * * *                     3               2               3
    * * * * * * * *                     4               0               4
    ---------------                    spaces = 2 *(n-i)
    * * * * * * * *
    * * *     * * *
    * *         * *
    *             *
 */

import java.util.*;
public class Pattern10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
