/*
        CONSTRUCTORS
                -- this--> invoke another constructor also
                -- super--> Do not invoke any other constructor
        NOTE -> this and super MUST be the first statement of a Constructor
 */
import java.util.*;
class Constructor{
    Constructor(){
        System.out.println("Hello, I am a Default Constructor...");
    }
    Constructor(int x){
        this();      // super();
        System.out.println("Hello, I am a Parameterized Constructor with value-- "+x);
    }
}
public class oops3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Constructor co = new Constructor(10);
    }
}
