/*                                    i      space     number
        1                             1        4        1x1
       2 2                            2        3        2x2
      3 3 3                           3        2        3x3
     4 4 4 4                          4        1        4x4
    5 5 5 5 5                         5        0        5x5
 */
import java.util.*;
public class Pattern12 {
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
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
