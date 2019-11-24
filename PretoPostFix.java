package achievers1;
import java.util.*;

public class PretoPostFix {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter String");
        String prefix=input.next();
        
        int n=prefix.length();
        char postArr[]=new char[n];
        char onlychar[]=new char[n];
        
        char prefixArr[]=prefix.toCharArray();
        int k=0;
        int z=0;
        for(int i=0;i<n;i++)
        {
            if(prefixArr[i]>64 && prefixArr[i]<91)
            {
                onlychar[k]=prefixArr[i];
                k++;
            }
            else
            {
                postArr[n-1-i]=prefixArr[i];
            }
        }
        
        for(int i=0;i<n;i++)
        {
            if(postArr[i]==0)
            {
                postArr[i]=onlychar[z];
                z++;
            }
        }
        
        for(int i=0;i<postArr.length;i++)
        {
            System.out.print(postArr[i]);
        }
        
        System.out.println();
    }
}
