class Shapes{
    int length,width;
    Shapes(){
        System.out.println("I am a base class constructor...");
    }
    Shapes(int length,int width){
        this.length = length;
        this.width = width;
    }
}
class Rectangles extends Shapes{
    Rectangles(){
        super(3,4);
        System.out.println("I am a derived class constructor...");
    }

}

public class inheritance2 {
    public static void main(String[] args){
        Rectangles rc = new Rectangles();

    }
}
