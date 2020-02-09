

import java.util.*;

public class Que2 {


    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    a[j]=a[j]+1;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
