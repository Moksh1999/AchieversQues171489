package achievers1;
import java.util.*;

public class FormLargestNumber {
    public static void main(String args[])
    {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Array of Numbers :-");
		String s=sc.nextLine();
		
                String[] str=s.split(" ");
		int n=str.length;
		Arrays.sort(str,Collections.reverseOrder());
		String num="";
		for(int i=0;i<n;i++){
			num=num+str[i];
		}
		long max=Long.parseLong(num);
                
                System.out.println("Largest Number is :-\n"+max);
    }
}
