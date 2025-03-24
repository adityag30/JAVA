/*
    Inheritance in Interface-> only a class can implements Interfaces
 */
interface I12{
    void foo();
}
interface I13 extends I12{
    void fooo();
}
class Boo implements I13{
    public void foo(){
        System.out.println("Best of Luck !");
    }
    public void fooo(){
        System.out.println("ThankYou!");
    }
}
public class inheritance6 {
    public static void main(String[] args){
        Boo b = new Boo();
        b.foo();
        b.fooo();
    }
}
