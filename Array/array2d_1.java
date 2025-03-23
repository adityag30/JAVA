import java.util.*;
public class array2d_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row size");
        int n = sc.nextInt();
        System.out.println("Enter Column size");
        int m = sc.nextInt();
        //initializing a 2d array
        int [][] a = new int[n][m];
        //inputting elements
        System.out.println("Enter 2D array elements");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j] = sc.nextInt();
            }
        }
        //Printing the array
        System.out.println("The 2D array is-");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
