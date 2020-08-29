// circular link list
class Circularlinkpos
{
	static void travese(Node head)
	{
		Node p=head;
		do
		{
		
			System.out.println(p.data+" ");
				p=p.next;
		}while(p.next!=head);
		System.out.println(p.data);
	}
  static Node insertpos(int d,Node head,int in)
  {
  	Node newnode=new Node(d);
 Node p=head;
 
 for (int i=0;i<in ;i++ ) {
 	p=p.next;
 	
 }

 newnode.next=p.next;
 p.next=newnode;

   return head;
  }

	public static void main(String[] args) {
	 Node head = null;
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
     
        head=insertpos(7,head,2);

   
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