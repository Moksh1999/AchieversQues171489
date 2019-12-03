package achievers1;
import java.util.*;

public class Phonebook 
{
	
	public static void main(String args[])
	{
		
    HashMap<String,String> map=new HashMap<String,String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<size;i++)
		{
			
			System.out.println("Enter name of the person");
			String name=sc.nextLine();
			System.out.println("Enter the Phone number");
			String phone=sc.nextLine();
			map.put(name, phone);
		}
		
		while(sc.hasNext())
		{
			String name=sc.nextLine();
			if(map.get(name)!=null)
			{
				System.out.println(name+"="+map.get(name));
			}
			else
			{
				System.out.println("Not user found");
			}
		}
	}
	

}
