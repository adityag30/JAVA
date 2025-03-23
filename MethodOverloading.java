/*
        Method Overloading --> compile time Polymorphism
                           --> same function name having different rules-
                                  1-> different number of Arguments
                                  2-> different types of Arguments
                                  3-> different order of Arguments
 */
//import java.util.*;
public class MethodOverloading {
    public static void fun(){
        System.out.println("No Arguments function");
    }
    public static void fun(int x, int y){
        System.out.println("Two Argument function of same type");
    }
    public static void fun(int x, char ch, int z){
        System.out.println("Three Argument function having different types");
    }
    public static void main(String[] args){
        //Scanner sc = new Scanner (System.in);
        fun();
        fun(2,3);
        fun(2,'p',5);

    }
}
