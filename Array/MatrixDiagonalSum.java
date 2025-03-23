import java.util.*;
public class MatrixDiagonalSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();
        if(n!=m){
            System.err.println("Error!!\nMatrix must be Square");
        }
        int [][]a = new int[n][m];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int ps=0,ss=0;
        for(int i=0;i<n;i++){
            ps+=a[i][i];
            ss+=a[i][m-1-i];
        }
        System.out.println("Primary Diagonal Sum "+ps);
        System.out.println("Secondary Diagonal Sum "+ss);
    }
}
