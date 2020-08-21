//linklist though user
import java.util.*;
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
class Linkuse1
{  
    static Node list;
	public static void  show(Node head)
	{
		Node n=head;
		while(n!=null)
		{
			System.out.println(" "+n.data);
		   n=n.next;
		}  
	}
	public static Node Insert(int ele,Node head)
	{
		
		if(head==null)
		{
			head=new Node(ele);
			  list=head;	
		}
		
		else
		{
			list.next=new Node(ele);
			list=list.next;
		}
		
		return head;
	}

	public static void main(String ar[])
	{
	Node head=null;	
		Node list=null;
		Scanner sc =new Scanner(System.in);
		Linkuse1 link=new Linkuse1();
		int n=sc.nextInt();
		System.out.println("enter the "+n+"element in list");
		while(n-->0)
		{
			int ele=sc.nextInt();
			 head=Insert(ele,head);
		
		}
	/*	Node first=new Node(23);
		Node second=new Node(22);
		Node third=new Node(21);
		link.head=first;
		first.next=second;
		second.next=third; */		
        show(head);
	}
}
