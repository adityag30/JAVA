import java.util.*;
public class array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max= arr[0], max_c = 0;
        for (int i = 0; i < n; i++) {
            int c= 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    c++;
                }
            }
            if (c > max_c) {
                max_c = c;
                max= arr[i];
            }
        }
        System.out.println("Max occurring element: " + max);
    }
}

