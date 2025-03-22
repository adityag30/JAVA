import java.util.*;
public class array3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the size of Array");
                    int n = sc.nextInt();
                    int[] a = new int[n];
                    boolean[] v = new boolean[n];
                    System.out.println("Enter array elements");
                    for (int i = 0; i < n; i++) {
                        a[i] = sc.nextInt();
                    }
                    for (int i = 0; i < n; i++) {
                        if (v[i]) {
                            continue;
                        }
                        int count = 1;
                        for (int j = i + 1; j < n; j++) {
                            if (a[i] == a[j]) {
                                count++;
                                v[j] = true;
                            }
                        }
                        System.out.println(a[i] + " appears " + count + " times ");
                    }
                    break;
                case 2:
                    System.out.println("Enter the size of Array");
                    int m = sc.nextInt();
                    int[] b = new int[m];
                    int s_largest = Integer.MIN_VALUE;
                    int largest = Integer.MIN_VALUE;
                    System.out.println("Enter array elements");
                    for (int i = 0; i < m; i++) {
                        b[i] = sc.nextInt();
                    }
                    for(int i=0;i<m;i++){
                        if(b[i]>largest){
                            s_largest = largest;
                            largest=b[i];
                        }
                        else if(b[i]>s_largest && b[i]!=largest){
                            s_largest = b[i];
                        }
                    }
                    if(s_largest!=Integer.MIN_VALUE){
                        System.out.println("Second largest element is = "+s_largest);
                    }
                    else{
                        System.out.println("No second largest element is present");
                    }
                    break;
                default :
                    System.err.println("Terminating.....");
                    break;
            }
        }while(ch<=2);
    }
}
