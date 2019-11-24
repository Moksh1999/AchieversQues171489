package achievers1;
import java.util.*;

public class ReverseDoublyLL {
    static class Node{
        Node next;
        Node prev;
        int data;
        Node(int d)
        {
            data=d;
            next=prev=null;
        }
    }
    static Node head;
    public static ReverseDoublyLL insert(ReverseDoublyLL li,int data)
    {
        Node newnode=new Node(data);
        newnode.next=null;
        
        if(li.head==null)
        {
            li.head=newnode;
            newnode.prev=null;
            
        }
        else
        {
            Node temp=li.head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.prev=temp;
        }
        return li;
    }
    
    public static void display(ReverseDoublyLL li)
    {   
        Node tail=li.head;
        while(tail.next!=null)
        {
            tail=tail.next;
        }
        System.out.println("List is");
        while(tail!=li.head)
        {
            System.out.println(tail.data);
            tail=tail.prev;
        }
        System.out.println(tail.data);
    }
    
    public static void main(String args[])
    {
        ReverseDoublyLL li=new ReverseDoublyLL();
        Scanner input=new Scanner(System.in);
        
        System.out.println("How many elements you want to enter");
        int n=input.nextInt();
        
        for(int i=0;i<n;i++)
        {
            int elem=input.nextInt();
            li.insert(li,elem);
        }
        
        li.display(li);
    }
}
