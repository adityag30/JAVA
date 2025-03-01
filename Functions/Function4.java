import java.util.*;
public class Function4 {
    public static void table(int x){
        for(int i=1;i<=10;i++){
            System.out.println(x+"*"+i+"="+x*i);
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number--");
        int a = sc.nextInt();
        table(a);
    }
}

