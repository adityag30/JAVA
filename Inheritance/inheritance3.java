/*
    Method Overriding-> requires property of inheritance
                     -> method of base class will override in derived class
                     -> method name will remain same
*/
class A{
    public void fun(){
        System.out.println("I am a base class method...");
    }
}
class B extends A{
    @Override
    public void fun(){
        System.out.println("I am a derived class overridden method...");
    }
}
public class inheritance3 {
    public static void main(String[] args){
        A obj = new A();
        obj.fun();
        B obj1 = new B();
        obj1.fun();
    }
}
