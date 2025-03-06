/*
    Enter the n numbers by user and print the count of Positives, Negatives and Zeroes.
 */
import java.util.*;
public class Function5 {
    public static void  Count(int n){
        Scanner sc = new Scanner(System.in);
        int pos=0;
        int neg=0;
        int zeros=0;
        System.out.println("Enter Numbers--");
         while(n!=0){
             int num = sc.nextInt();
             if(num==0){
                 zeros+=1;
             }
             else if(num>0){
                 pos+=1;
             }
             else{
                 neg+=1;
             }
             n--;
         }
         System.out.println("POSITIVES--"+pos);
         System.out.println("NEGATIVES--"+neg);
         System.out.println("ZEROES--"+zeros);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count of number you want to enter");
        int n = sc.nextInt();
        Count(n);
    }
}
