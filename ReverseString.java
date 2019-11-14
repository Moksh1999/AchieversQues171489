import java.util.*;

public class ReverseString {

    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter String");
        String str=input.next();
        char a[]=str.toCharArray();
        int length = str.length();
        char demo[]=new char[length];
        for(int i=0;i<length;i++)
        {
            demo[i]=0;
        }
        
        for(int i=0;i<length;i++)
        {
            if(a[i]>33 && a[i]<47)
            {
                demo[i]=a[i];
                a[i]=0;
            }
        }
        
        int l=a.length;
        char b[]=new char[l];
        int k=0;
        for(int i=l-1;i>=0;i--)
        {
            if(a[i]!=0)
            {
            b[k]=a[i];
            k++;
            }
        }
        
        int z=0;
        for(int i=0;i<l;i++)
        {
            if(demo[i]==0)
            {
                demo[i]=b[z];
                z++;
            }
        }
        
        for(int i=0;i<length;i++)
        {
            System.out.print(demo[i]);
        }
    }
}
