package Achievers1;
import java.util.*;

public class LinkedList3 {

    static class Node
    {
        Node next;
        int data;
        
        Node(int d)
        {
            data = d;
            
        }
    }
    
    Node head;
    static StringBuilder sb2=new StringBuilder();
    public static LinkedList3 insert(LinkedList3 li , int data)
    {
        Node newnode = new Node(data);
        
        if(li.head==null)
        {
            li.head = newnode;
            sb2.append(newnode.data);
        }
        else
        {
            Node last = li.head;
            while(last.next!=null)
            {
                last = last.next;
            }
            last.next = newnode;
            sb2.append(newnode.data);
        }
        return li;
    }
    static StringBuilder sb=new StringBuilder();
    public static void displayrev(LinkedList3 li)
    {
        Node prev = null;
        Node next = null;
        Node current = li.head;
        while(current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        li.head = prev;
        
        while(prev!=null)
        {
           // System.out.println(prev.data);
            sb.append(prev.data);
            prev = prev.next;
        }
       
    }
    
    
    public static void main(String args[])
    {
        LinkedList3 li = new LinkedList3();
         Scanner s=new Scanner(System.in);
         System.out.println("Enter sie of LL");
         int n=s.nextInt();
         for(int i=0;i<n;i++)
         {
             int elem=s.nextInt();
             li.insert(li,elem);
         }
         li.displayrev(li);
         String demo=sb.toString();
         String demo2=sb2.toString();
         
         if(demo.equals(demo2))
         {
             System.out.println("Palindrome");
         }
         else
             System.out.println("Not a Palindrome");
    }
    
}

