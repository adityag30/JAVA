/*
    Abstract Method-> A method which is declared without an implementation
        If a class contains any Abstract method then that must have to be the Abstract class.
        If there are n number of Abstract methods in an Abstract class then we must have to override each method
            in derived class.
        We cannot create Object of an Abstract class.
*/
abstract class A1{
    A1(){
        System.out.println("I am a default constructor of Abstract class...");
    }
    public abstract void fun();
}
class B1 extends A1{
    B1(){
        super();
        System.out.println("I am a Default constructor of derived class...");
    }
    @Override
    public void fun(){
        System.out.println("I am a derived class overridden method...");
    }
}
public class inheritance4 {
    public static void main(String[] args){
        B1 obj1 = new B1();
        obj1.fun();
    }
}
