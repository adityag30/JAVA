class Shape{
    int length,width,height;
    Shape(){}
    Shape(int length,int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
}
class Rectangle extends Shape{
    public int area(int l,int w){
        return l*w;
    }
    public int volume(int l, int w, int h){
        return l*w*h;
    }
}

public class inheritance1 {
    public static void main(String[] args){
        Rectangle rc = new Rectangle();
        System.out.println("Area of Rectangle is-- "+ rc.area(2,3));
        System.out.println("Volume of Rectangle is-- "+ rc.volume(2,3,4));
    }
}
