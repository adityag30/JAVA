/*
    Multiple Classes
 */
import java.util.*;
class Square{
    int side;
    Square(){
        System.out.println("Default Constructor of Square class is Invoked...");
    }
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class Circle{
    int radius;
    Circle(){
        System.out.println("Default Constructor of Circle class is Invoked...");
    }
    public int area(){
        return radius*radius;
    }
    public double perimeter(){
        return 2*3.14*radius;
    }
}
public class oops4 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        Square sq = new Square();
        System.out.println("Enter the side of Square");
        int a = sc.nextInt();
        sq.side=a;
        System.out.println("Area of Square is " + sq.area());
        System.out.println("Perimeter of Square is " + sq.perimeter());
        System.out.println();
        Circle cl = new Circle();
        System.out.println("Enter the radius of circle");
        int r = sc.nextInt();
        cl.radius=r;
        System.out.println("Area of Circle is " + cl.area());
        System.out.println("Perimeter of Circle is " + cl.perimeter());
    }
}
