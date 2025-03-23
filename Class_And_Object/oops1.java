/*
    Basic Class And Object Example using GETTER and SETTER
*/
import java.util.*;
class Employee{
    StringBuffer name;
    int age;
    public void setName(StringBuffer name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public StringBuffer getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class oops1 {
    public static void main(String[] args){
    Employee ep = new Employee();
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    StringBuffer str = sb.append("Aditya");
    int n = sc.nextInt();
    ep.setName(str);
    ep.setAge(n);
    System.out.println("Name is "+ep.getName());
    System.out.println("Age is "+ep.getAge());
    }
}
