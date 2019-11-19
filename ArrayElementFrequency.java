package achievers1;
import java.util.*;

public class ArrayElementFrequency {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of elements");
        int n=input.nextInt();

        int a[]=new int[n];
        int counter[]=new int[n];
        for(int i=0;i<n;i++)
        {
            counter[i]=0;
        }

        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }

       for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    counter[i]++;
                }
            }
        }


       for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    a[j]=0;
                    counter[j]=0;
                }
            }
        }



        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            {
            System.out.println(a[i]+" : "+counter[i]);
            }
        }

    }

}
