import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,key;
        do {
            System.out.println("""
                Enter 1 for Addition
                Enter 2 for Subtraction
                Enter 3 for Multiplication
                Enter 4 for Division
                Enter 5 for Modulus
                Enter 0 to Terminate""");
            key = sc.nextInt();
            switch (key) {
                case 1:
                    System.out.println("Enter the count of numbers to add");
                    n = sc.nextInt();
                    int a[] = new int[n];
                    System.out.println("Enter the numbers");
                    for (int i = 0; i < n; i++) {
                        a[i] = sc.nextInt();
                    }
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        sum += a[i];
                    }
                    System.out.println("Addition of the numbers is " + sum);
                    break;
                case 2:
                    System.out.println("Enter the count of numbers to Subtract");
                    n = sc.nextInt();
                    int b[] = new int[n];
                    System.out.println("Enter the numbers");
                    for (int i = 0; i < n; i++) {
                        b[i] = sc.nextInt();
                    }
                    int sub = b[0];
                    for (int i = 1; i < n; i++) {
                        sub -= b[i];
                    }
                    System.out.println("Subtraction of the numbers is " + sub);
                    break;
                case 3:
                    System.out.println("Enter the count of numbers to Multiply");
                    n = sc.nextInt();
                    int c[] = new int[n];
                    System.out.println("Enter the numbers");
                    for (int i = 0; i < n; i++) {
                        c[i] = sc.nextInt();
                    }
                    int mul = 1;
                    for (int i = 0; i < n; i++) {
                        mul *= c[i];
                    }
                    System.out.println("Multiplication of the numbers is " + mul);
                    break;
                case 4:
                    System.out.println("Enter the two numbers for division");
                    double num1 = sc.nextDouble();
                    double num2 = sc.nextDouble();
                    double res;
                    if (num2 == 0) {
                        System.err.println("Denominator cannot be zero, Input again");
                    }
                    res = num1 / num2;
                    System.out.println("Result is " + res);
                    break;
                case 5:
                    System.out.println("Enter the two numbers for modulo operation");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    double result;
                    result = num1 % num2;
                    System.out.println("Result is " + result);
                    break;
                default:
                    System.err.println("Sorry!!\nWrong function.");
                    break;
            }
        }while(key<=5);
    }
}
