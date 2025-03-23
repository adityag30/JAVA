import java.util.*;
public class string3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        int[] f=new int[256];
        int i;
        for(i=0;i<s.length();i++) {
            f[s.charAt(i)]++;
        }
        System.out.println("Frequency of each character is:");
        for(i=0;i<256;i++) {
            if(f[i]>0) {
                System.out.println((char)i+":"+f[i]);
            }
        }
    }
}

