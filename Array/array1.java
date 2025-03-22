import java.util.*;
public class array1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // Initialising an array
        int n;
        System.out.println("Enter the size of array ");
        n=sc.nextInt();
        int []a = new int[n];
        //inputting elements in array
        System.out.println("Enter array elements- ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        //printing the array
        System.out.println("The Array elements are- ");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
