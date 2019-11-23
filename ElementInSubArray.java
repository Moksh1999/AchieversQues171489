package achievers1;
import java.util.*;

public class ElementInSubArray {
    public static void main(String args[])
    {
        int max=0;
        int counter=0;
    Scanner input=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=input.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println("Enter Element");
        int s=input.nextInt();
        
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
             
                       max=0;
                       for(int l=i;l<=j;l++)
                       {
                           if(arr[l]>max)
                           {
                               max=arr[l];
                           }
                       }
                       if(max>s)
                       {
                           counter++;
                       }
                
            }
        }
        System.out.print(counter+" ");
    }
}
