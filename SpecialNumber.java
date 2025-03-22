import java.util.*;
public class SpecialNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>=10 && num<=99){
            int n = num /10;
            int m = num % 10;
            int sod = n+m;
            int pod = n*m;
            int result = sod+pod;
            if(result==num){
                System.out.println("Special 2-digit Number");
            }
            else{
                System.out.println("Not a special 2-digit Number");
            }
        }
        else{
            System.out.println("Input is not a 2-digit number");
        }
    }
}
