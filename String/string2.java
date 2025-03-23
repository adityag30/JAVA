import java.util.*;
class string2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //Using String
        System.out.println("Enter string");
        String s=sc.nextLine();
        String s1="";
        int i;
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!='a' && ch!='e'&& ch!='i' && ch!='o'&& ch!='u'&&ch!='A'
                    && ch!='E'&& ch!='I' && ch!='O'&& ch!='U')
            {
                s1=s1+ch;
            }
        }
        System.out.println("String  without vowels is:\n"+s1);

    }
}

