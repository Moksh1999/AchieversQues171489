import java.util.*;



public class LinkedList {
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }

    }
    Node head;
    public LinkedList insert(LinkedList li, int data)
    {

        Node newNode = new Node(data);
        newNode.next = null;
        if(li.head == null)
        {
            li.head = newNode;

        }
        else
        {


            Node last = li.head;
            while(last.next != null)
            {
                last = last.next;


            }
            last.next = newNode;

        }

        return li;

    }

    public static void checkEvenOdd(LinkedList li,int n)
    {
        Node temp=li.head;
        int sum=0;
        while(temp!=null)
        {
            sum=sum+temp.data;
            temp=temp.next;
        }
        if((sum/n)%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }

    public static void display(LinkedList li)
    {
        Node temp=li.head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        LinkedList li=new LinkedList();
        int count=0;
        String str=s.nextLine();
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            count++;
            int demo=Integer.parseInt(st.nextToken());
            li.insert(li,demo);
        }

       li.checkEvenOdd(li,count);
    }
}
