/*
    Array of Objects
 */
import java.util.*;
class Student{
    String name;
    int age;
    String section;
    public Student(String name, int age, String section) {
        this.name = name;
        this.age = age;
        this.section = section;
        //System.out.println("Parameterized Constructor...");
    }
    public void display(){
        System.out.println("Name-"+ name +" : "+ "Age-" + age + " : "+ "Section-" + section);
    }
}
public class oops5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of students-");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] st = new Student[n];
        System.out.println("Enter the Information\n");
        for(int i=0;i<n;i++){
            System.out.println("Enter the name of the " + i + " Student");
            String name = sc.nextLine();
            System.out.println("Enter the age of the " + i + " Student");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the section of the " + i + " Student");
            String section = sc.nextLine();
            st[i] = new Student(name,age,section);
        }
        System.out.println();
        System.out.println("The Information is-");
        for(Student student : st){
            student.display();
        }
    }
}
