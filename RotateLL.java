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

    public static void Rotate(LinkedList1 li,int n)
    {
        int k=0;
        Node current=li.head;
        Node previous=null;
        while(k<n && current!=null)
        {
            previous=current;
            current=current.next;
            k++;
        }

        Node temp=current;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }

        Node demo=li.head;
        while(demo!=current)
        {
            System.out.println(demo.data);
            demo=demo.next;
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

        System.out.println("Time to rotate?");
        int s=input.nextInt();
        li.Rotate(li,s);
    }
}
