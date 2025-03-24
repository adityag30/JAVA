/*
    Inheritance in Java -> Base class will inherit by using extends keyword
                    Types of Inheritance->  1) Single level Inheritance
                                            2) Multilevel Inheritance
                                            3) Hierarchical Inheritance
 */
class Shape{
    int length,width,height;
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int area(){
        return length*width;
    }
}
class Rectangle extends Shape{
    public int volume(){
        return length*width*height;
    }
}
public class inheritance1 {
    public static void main(String[] args){
        Rectangle rc = new Rectangle();
        rc.setLength(2);
        rc.setWidth(3);
        rc.setHeight(4);
        System.out.println("Area of Rectangle is-- "+ rc.area());
        System.out.println("Volume of Rectangle is-- "+ rc.volume());
    }
}
