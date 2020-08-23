class Linkdellast
{
	static void travese(Node head)
	{
		Node start=head;
		while(start!=null)
		{
			System.out.println(start.data+" ");
			start=start.next;
		}
	}
	
	static Node Delete(Node head,int in){
	Node p=head;
	Node q=head.next;
	while(q.next!=null)
	{
		p=p.next;
		q=q.next;
	}
	p.next=null;
	Node k=q;
	System.gc();
	return head;
		
	}
	 public static void main(String[] args) {
	 	Node head=null;
Linkdellast link=new Linkdellast();
Node n1=new Node(12);
Node n2=new Node(23);
Node n3=new Node(66);
Node n4=new Node(96);
Node n5=new Node(70);
Node n6=new Node(18);
Node n7=new Node(90);
Node n8=new Node(65);
head=n1;
n1.next=n2;
n2.next=n3;
n3.next=n4;
n4.next=n5;
n5.next=n6;
n6.next=n7;
n7.next=n8;
 head=Delete(head,6);
travese(head);
	}
}
class Node
{
	Node next;
	int data;
	Node(int d)
	{
    data=d;
    next=null;
	}
}