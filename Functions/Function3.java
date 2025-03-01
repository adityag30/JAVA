import java.util.*;
public class Function3 {
    public static void even(int x){
        if(x%2==0){
            System.out.println("The Given Number is Even");
        }
        else{
            System.out.println("The Given Number is Not Even");
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number--");
        int a = sc.nextInt();
        even(a);
    }
}
