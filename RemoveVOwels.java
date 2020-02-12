package practiceds.UJAgroup;
import java.util.*;
/**
 *
 * @author HP
 */
public class RemoveVOwels {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        String final1="";
                
        char a[]=str.toCharArray();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u')
            {
                a[i]=0;
            }
        }
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                final1=final1+a[i];
            }
        }
        
        System.out.println(final1);
    }
    
}
