/*
    * * * * *---n
    *       *---n
    *       *---n
    * * * * *---n
    | | | | |
    | | | | |
    m m m m m
      i==1 || j==1 || i==n || j==m
 */
import java.util.*;
public class Pattern2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        System.out.println("Enter number of columns");
        int m = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(i==1 || j==1 || i==n || j==m) {
                    System.out.print("*"+" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}
