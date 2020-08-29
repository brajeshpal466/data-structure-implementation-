// Doubly link list
class Doublylink
{
	static void travese(Node head)
{
	Node start=head;
	while(start.next !=null)
	{
		System.out.println(" "+start.data);
		start=start.next;
	}
	System.out.println(start.data+"\n previous travese of doubly link list");
	Node tell=start;
	while(tell !=null)
	{
		System.out.println("  "+tell.data);
		tell=tell.prev;
	}
}
	public static void main(String[] args) {
		Node head=null;
		Node n1=new Node(12);
		Node n2=new Node(23);
		Node n3=new Node(34);
		Node n4=new Node(46);
		head=n1;
		n1.prev=null;
		n1.next=n2;
		n2.prev=n1;
		n2.next=n3;
		n3.prev=n2;
		n3.next=n4;
		n4.prev=n3;
		n4.next=null;
		travese(head);
	}
}
class Node 
{
	int data;
	Node prev;
	Node next;
	Node(int d)
	{
		data=d;
		prev=null;
		next=null;
	}
}