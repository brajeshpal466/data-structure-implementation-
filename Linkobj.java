// linked list though object
import java.util.*;
class Linkobj
{
	static Node list=null;
	static void travese(Node head)
	{
      Node start=head;
      while(start != null)
      {
      	System.out.println(start.data+"\t");
      	start=start.next;
      }
	}
  static Node insertbeg(int d,Node head)
  {
   Node newnode=new Node(d);
   if(head==null)
   {
    head=newnode;
    list=head;
   }
   else
   {
    newnode.next=head;
   head=newnode;
   
   }
   return head;
  }
	static Node insert(int data,Node head)
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
	 public static void main(String[] args) {
	 	Node head=null;
	 /*	Node n1=new Node(12);
	 	Node n2=new Node(42);
	 	Node n3=new Node(22);
        head=n1;
        n1.next=n2;
        n2.next=n3; */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of element");
        int n=sc.nextInt();
      while(n-->0)
      {
      	int ele=sc.nextInt();
      	head=insert(ele,head);
      }
      System.out.println("enter the element for insert in begning");
      int key=sc.nextInt();
      head=insertbeg(key,head);

        travese(head);
		
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