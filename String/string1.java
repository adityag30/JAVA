/*
    String -> predefined class
              immutable
    StringBuffer -> mutable

    NOTE -> (= =) in String or StringBuffer class compare the references not the content.

 */
import java.util.*;
public class string1 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        // initialization of String class
        String s = new String("Hello");

        // Methods for String Class
        System.out.println("String is= " + s);
        System.out.println("Length of String is= " + s.length());
        System.out.println("Concatenated String is= " + s.concat(" Aditya"));
        System.out.println("Comparison= "+ s.compareTo("Hello"));
        System.out.println("Substring = " + s.substring(2,5));
        System.out.println("Character at index = " + s.charAt(3));
        System.out.println("Character First index is= "+ s.indexOf('l'));
        System.out.println("Uppercase= " + s.toUpperCase());
        System.out.println("Lowercase= " + s.toLowerCase());
        System.out.println("Replacing a specific Character= "+ s.replace('o','P'));
        System.out.println("To check if String is Empty= " + s.isEmpty());
        System.out.println("String to Character Array= ");
        for(char ch : s.toCharArray()){
            System.out.println(ch);
        }
        System.out.println("To repeat the string n no of times= "+ s.repeat(2));
        System.out.println();

        // initialization of StringBuffer class
        StringBuffer sb = new StringBuffer("How Are You!");
        StringBuffer sb1  = new StringBuffer("Howareyou");

        //Methods of StringBuffer Class
        System.out.println("StringBuffer string is= "+ sb);
        System.out.println("Length= " + sb.length());
        System.out.println("Appended= " + sb.append(" Thank-you!"));
        System.out.println("Substring= "+ sb.substring(3,8));
        System.out.println("Character At index is= "+ sb.charAt(8));
        System.out.println("To delete a Specific Character= "+ sb.deleteCharAt(6));
        System.out.println("To delete a Substring= " + sb.delete(2,5));
        System.out.println("Capacity of String= "+sb.capacity());
        System.out.println("To insert a specific Character at a specific index is= "+sb.insert(9,'Z'));
        System.out.println("To compare= "+sb.compareTo(sb1));
        System.out.println("Is Equals to = "+sb.equals(sb1));
        System.out.println("Reverse the String= "+ sb.reverse());
        System.out.println("Capacity = "+sb.isEmpty());
        System.out.println("To string operation= "+sb.toString());
    }
}
