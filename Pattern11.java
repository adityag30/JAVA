/*                                    i      space     stars
            * * * * *                 1        4         5
          * * * * *                   2        3         5
        * * * * *                     3        2         5
      * * * * *                       4        1         5
    * * * * *                         5        0         5
 */
import java.util.*;
public class Pattern11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
