/*
    Interface-> collection of abstract methods(by default all methods are abstract in interface)
             -> multiple inheritance
             -> run time polymorphism
             -> we cannot create constructors, variables.
             -> we cannot instantiate interface
             -> in class it will inherit using implements keyword
             -> if any class inherits interface then the methods present in it must be overridden.
*/
interface I1{
    void fi();
    void fo();
}
class Fun implements I1{
    public void fi(){
        System.out.println("Hello Brother...");
    }
    public void fo(){
        System.out.println("Hello Sister...");
    }
}
public class inheritance5 {
    public static void main(String[] args){
        Fun f = new Fun();
        f.fi();
        f.fo();
    }
}
