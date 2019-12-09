package achievers1;
import java.util.*;

public class MergeArray {
    
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Size of 1st array");
        int n1=s.nextInt();
        int a[]=new int[n1];
        System.out.println("Size of 2nd array");
        int n2=s.nextInt();
        int b[]=new int[n2];
        
        System.out.println("Enter 1st array");
        for(int i=0;i<n1;i++)
        {
            a[i]=s.nextInt();
        }
        
        System.out.println("Enter 2nd array");
        for(int i=0;i<n2;i++)
        {
            b[i]=s.nextInt();
        }
        
        int c[]=new int[n1+n2];
        int k=0;
        
        for(int i=0;i<n1;i++)
        {
            c[k]=a[i];
            k++;
        }
        
        for(int i=0;i<n2;i++)
        {
            c[k]=b[i];
            k++;
        }
        
        System.out.println("Merged Array");
        
        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }
    }
}
