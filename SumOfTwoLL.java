package Achievers1;
import java.util.*;

public class LinkedList2 {

    static class Node
    {
        Node next;
        int data;
        
        Node(int d)
        {
            data = d;
            
        }
    }
    
    static StringBuilder sb = new StringBuilder();
    static StringBuilder sb2 = new StringBuilder();
    Node head;
    public static LinkedList2 insert1(LinkedList2 li , int data)
    {
        
        Node newnode = new Node(data);
        
        if(li.head==null)
        {
            li.head = newnode;
            sb.append(newnode.data);
        }
        else
        {
            Node last = li.head;
            while(last.next!=null)
            {
                last = last.next;
            }
            last.next = newnode;
             sb.append(newnode.data);
        }
        return li;
    }
       public static LinkedList2 insert2(LinkedList2 li2 , int data)
    {
        
        Node newnode = new Node(data);
        
        if(li2.head==null)
        {
            li2.head = newnode;
            sb2.append(newnode.data);
        }
        else
        {
            Node last = li2.head;
            while(last.next!=null)
            {
                last = last.next;
            }
            last.next = newnode;
             sb2.append(newnode.data);
        }
        return li2;
    }
    
    public static LinkedList2 insert3(LinkedList2 li3 , int data)
    {
        
        Node newnode = new Node(data);
        
        if(li3.head==null)
        {
            li3.head = newnode;
        }
        else
        {
            Node last = li3.head;
            while(last.next!=null)
            {
                last = last.next;
            }
            last.next = newnode;
        }
        return li3;
    }
    
  public static void display(LinkedList2 li)
	{
		System.out.println("THE LINKED-LIST IS:");
		Node temp = li.head;
		while(temp!=null)
		{
			System.out.print(temp.data);
			temp = temp.next;
		}
		
	}
    
   
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        LinkedList2 li = new LinkedList2();
        LinkedList2 li2 = new LinkedList2();
        LinkedList2 li3 = new LinkedList2();    
    
        System.out.println("Enter size of List 1");
        int n1=input.nextInt();
        for(int i=0;i<n1;i++)
        {
            int elem=input.nextInt();
            li.insert1(li,elem);
        }
        
        System.out.println("Enter size of List 2");
        int n2=input.nextInt();
        for(int i=0;i<n2;i++)
        {
            int elem=input.nextInt();
            li2.insert2(li2,elem);
        }
        
         sb.reverse();
         String demo=sb.toString();
         int a=Integer.parseInt(demo);
         
         sb2.reverse();
         String demo2=sb2.toString();
         int b=Integer.parseInt(demo2);
         
         
         int c=a+b;
         
         String str=Integer.toString(c);
         
     
         for(int i=str.length()-1;i>=0;i--)
         {
             //System.out.println(Integer.parseInt(str.valueOf(str.charAt(i))));
             li3.insert3(li3,Integer.parseInt(str.valueOf(str.charAt(i))));
         }
         System.out.println();
         li3.display(li3);
         System.out.println();
         
    }
    
}

