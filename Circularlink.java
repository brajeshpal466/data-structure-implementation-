// circular link list
class Circulerlink
{
	static void travese(Node head)
	{
		Node p=head;
		do
		{
		
			System.out.println(p.data+" ");
				p=p.next;
		}while(p!=head);
		
	}
	public static void main(String[] args) {
		 Node head= null;
     Node n1=new Node(23);
     Node n2=new Node(33);
     Node n3=new Node(21);
     Node n4=new Node(67);
     Node n5=new Node(88);
     head=n1;
     n1.next=n2;
     n2.next=n3;
     n3.next=n4;
     n4.next=n5;
     n5.next=head;
     travese(head);
	}
}
class Node
{
	Node next;
	int data;
	Node(int d)
	{
		next=null;
		data =d;
	}
}