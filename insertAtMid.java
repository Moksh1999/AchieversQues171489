package achievers1;
import java.util.*;

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
    }
}
public class LinkedList1 {
    static Node head;
 
    
    public static LinkedList1 insert(LinkedList1 li,int data)
    {
        Node newnode = new Node(data);
        newnode.next=null;
        if(li.head==null)
        {
            li.head=newnode;
        }
        else
        {
            Node last=li.head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=newnode;
        }
       
        
        
        return li;
    }
    
    
   void insertAtMid(int data,int size)
	{
		int count;
		int x=size/2;
		if(size%2!=0)
			count=0;
		else
			count=1;
		Node current=head;
		Node temp=new Node(data);
		while(current!=null&&count<x)
		{
			count++;
			current=current.next;
		}
		Node t=current.next;
		current.next=temp;
		temp.next=t;
	}
    
    public static void display(LinkedList1 li)
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
        LinkedList1 li=new LinkedList1();
        Scanner input=new Scanner(System.in);
        System.out.println("How many elements you want to insert");
        int n=input.nextInt();
        for(int i=0;i<n;i++)
        {
            int element=input.nextInt();
            li.insert(li,element);
        }
        int mid=n/2;
        
        System.out.println("Enter value to insert at mid");
        int val=input.nextInt();
        
        li.insertAtMid(val,n);
        li.display(li);
       
    }
}
