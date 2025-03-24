/*
    Constructors in Inheritance
            super()-> refers to base class constructor or method
            this()-> refers to same class(derived class) constructor
 */
class Shapes{
    int length,width;
    Shapes(){
        System.out.println("I am a default constructor of base class...");
    }
    Shapes(int length,int width){
        this.length = length;
        this.width = width;
        System.out.println("I am a parameterized constructor of base class...");
    }
}
class Rectangles extends Shapes{
    Rectangles(){
        super();
        System.out.println("I am a default constructor of derived class ...");
    }
    Rectangles(int length,int width){
        this(); //super(length,width);   //here this() will call the Rectangles() default constructor
                                         //here super() will call the parameterized constructor of Base class
        System.out.println("I am a parameterized constructor of derived class...");
    }
}
public class inheritance2 {
    public static void main(String[] args){
        Rectangles rc = new Rectangles();
        Rectangles rc1 = new Rectangles(2,3);
    }
}
