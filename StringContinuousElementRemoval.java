package achievers1;
import java.util.*;

public class StringContinousElementRemoval {
    
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter String");
        String str=input.next();
        int n=str.length();
        char strArray[]=new char[n];
        strArray=str.toCharArray();
        char strFinal[]=new char[n];
      
        int k=0;
        if(strArray[0]!=strArray[1])
        {
            strFinal[k]=strArray[0];
            k++;
        }
        for(int i=1;i<n-1;i++)
        {
            if(strArray[i]!=strArray[i-1] && strArray[i]!=strArray[i+1])
            {
                strFinal[k]=strArray[i];
                k++;
            }
            
        }
        if(strArray[n-1]!=strArray[n-2])
        {
            strFinal[k]=strArray[n-1];
        }
        for(int i=0;i<n;i++)
        {
            if(strArray[i]!=0)
            {
                System.out.print(strFinal[i]);
            }
        }
        
        
        System.out.println();
    }
}
