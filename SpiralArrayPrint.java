package achievers1;
import java.util.*;

public class SpiralArrayPrint {
    public static void main(String strgs[])
    {
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        int col=s.nextInt();
        int arr[][]=new int[row][col];
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        
        int k=0;
        
        while(k<row)
        {
            if(k%2==0)
            {
                for(int j=0;j<col;j++)
                {
                    System.out.print(arr[k][j]+" ");
                }
                k++;
                System.out.println("");
            }
            else if(k%2==1)
            {
                for(int j=col-1;j>=0;j--)
                {
                    System.out.print(arr[k][j]+" ");
                }
                k++;
                System.out.println("");
            }
        }
        
        
    }
}
