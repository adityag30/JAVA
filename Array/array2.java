/*
    Input an array and print the index of the element given by user searched in the array.
 */
import java.util.*;
public class array2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array ");
        n=sc.nextInt();
        int []a = new int[n];
        System.out.println("Enter array elements- ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search-");
        int key = sc.nextInt();
        int flag=0;
        for(int i=0;i<n;i++){
            if(a[i]==key){
                System.out.println("Element present at index "+i);
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("Element not found-");
        }
    }
}

