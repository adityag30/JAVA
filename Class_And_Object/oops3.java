/*
        CONSTRUCTORS
                -- this--> invoke other constructor also
                -- super--> do not invoke any other constructor
 */
import java.util.*;
class Constructor{
    Constructor(){
        System.out.println("Hello, I am a Default Constructor...");
    }
    Constructor(int x){
        this();
        // super();
        System.out.println("Hello, I am a Parameterized Constructor with value-- "+x);
    }
}
public class oops3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Constructor co = new Constructor(10);
    }
}
