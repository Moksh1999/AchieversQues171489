import java.util.*;

public class SumArray {

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=input.nextInt();
        System.out.println("Enter elements of Array");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = input.nextInt();
        }

        System.out.println("Enter Sum");
        int temp=input.nextInt();



        for(int i=0;i<n-1;i++)
        {
            int sum=a[i];
            for(int j=i+1;j<n;j++)
            {
                sum=sum+a[j];
                if(sum==temp)
                {
                    System.out.println("Starting index = "+i);
                    System.out.println("Endeing index = "+j);
                }
            }
        }
    }
}
