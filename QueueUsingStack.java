public class QueueUsingStack
{
	static QueueUsingStack s=new QueueUsingStack();
	static QueueUsingStack s1=new QueueUsingStack();
	public static class Node
	{
		int data;
		Node Link;
	}
	Node top;
	QueueUsingStack()
	{
		this.top=null;
	}
	public void push2()
	{
		int d=top.data;
		top=top.Link;
		s1.push(d);
	}
	public void pop()
	{
		if(top==null)
		{
			System.out.println("Underflow");
		}
		System.out.println(top.data);
		top=top.Link;
	}
	public void push(int temp)
	{
		Node newNode=new Node();
		if(newNode==null)
		{
			System.out.println("Stack Overflow");
		}
		newNode.data=temp;
		newNode.Link=top;
		top=newNode;
		

	}
	public static void main(String args[])
	{
		s.push(10);
		s.push(20);
		s.push(30);
		s.push2();
		s.push2();
		s.push2();
		s1.pop();
		s1.pop();
		s1.pop();
	}
}
