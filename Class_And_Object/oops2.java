/*
        CONSTRUCTORS
 */
import java.util.*;
class Constructors{
    Constructors(){
        System.out.println("Hello, I am a Default Constructor...");
    }
    Constructors(int x){
        System.out.println("Hello, I am a Parameterized Constructor with value-- "+x);
    }
}
public class oops2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Constructors con = new Constructors();
        Constructors co = new Constructors(10);
    }
}