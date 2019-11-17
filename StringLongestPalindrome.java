package achievers1;
import java.util.*;

public class StringLongestPalindrome{

    public static String CheckPalindrome(String str)
    {
        String str3=str.substring(0,1);
        int k=str3.length();

        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                String str2=str.substring(i,j);
                String str1="";
                for(int z=str.length()-1;z>=0;z--)
                {
                    str1=str1+str2.charAt(z);
                }
                if(k<str1.length() && str1.equals(str2))
                {
                    str3=str1;
                    k=str1.length();
                }
            }
        }
        return str3;
    }
        public static void main(String args[])
        {
            Scanner input=new Scanner(System.in);
            String str=input.next();
            String checking=CheckPalindrome(str);
            System.out.println(checking);
        }
    }
