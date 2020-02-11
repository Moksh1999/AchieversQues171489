package practiceds.UJAgroup;
import java.util.*;
/**
 *
 * @author HP
 */
public class SecongLargestinArray {
    
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int max=0;
        int secmax=0;
        for(int i=0;i<n;i++)
        {
           
            if(a[i]>max)
            {
                secmax=max;
                max=a[i];
            }
            else if(a[i]>secmax && a[i]!=max)
            {
                secmax=a[i];
            }
        }
        
        
        System.out.println("MAX : "+max+"\n"+"SECMAX : "+secmax);
         
    }
}
