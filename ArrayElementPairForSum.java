package achievers1;
import java.util.*;

public class ArrayElementPairForSum {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first Array size");
        int first=s.nextInt();
        System.out.println("Enter second Array size");
        int sec=s.nextInt();
        System.out.println("Enter Sum ");
        int sum=s.nextInt();
        int arr1[]=new int[first];
        int arr2[]=new int[sec];
        System.out.println("Enter first array");
        for(int i=0;i<first;i++)
        {
            arr1[i]=s.nextInt();
        }
        
        System.out.println("Enter second array");
        for(int i=0;i<sec;i++)
        {
            arr2[i]=s.nextInt();
        }
        
        for(int i=0;i<first;i++)
        {
            for(int j=0;j<sec;j++)
            {
                if(arr1[i]+arr2[j]==sum)
                {
                    System.out.println(arr1[i]+" and "+arr2[j]);
                }
            }
        }
        
    }
}
