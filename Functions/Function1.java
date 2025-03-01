import java.util.*;
public class Function1 {
    public static int product(int x,int y){
        return x*y;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Numbers--");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The Product of the Numbers is--"+product(a,b));
    }
}

