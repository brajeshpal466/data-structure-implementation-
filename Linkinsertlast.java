// insert element at last
import java.util.*;
class Linkinsertlast
{
	static Node list=null;
	public static Node Insert(Node head,int data)
	{
		if(head==null)
		{
			head=new Node(data);
			list=head;
		}
		else
		{
		   list.next=new Node(data);
			list=list.next;
		}
		return head;
	}
	static Node insertinto(Node head,int data)
	{
      Node t=head;
      while(t.next!=null)
      {
      	t=t.next;
      }
      	Node newele=new Node(data);
      	t.next=newele;
 
      	return head;
      }
public static void travesal(Node k)

	{
		Node start=k;
		while(start !=null)
		{
			System.out.println(start.data+"");
			start=start.next;
		}
		
	}

public  static void main(String[] args) {
	Node head=null;
	Scanner sc=new Scanner(System.in);
	Linkinsertlast link=new Linkinsertlast();
	System.out.println("enter the element no of element to be insert in link list");
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		int ele=sc.nextInt();
		head=Insert(head,ele);
	}
	
	System.out.println("insert a new element at the last");
	int k=sc.nextInt();

	head=insertinto(head, k);
	travesal(head);		 
}
}
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
