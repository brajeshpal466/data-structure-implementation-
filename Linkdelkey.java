class Linkdelkey 
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
		Node p = head;
		Node q=head.next;
		
		while(q.data!=in && q.next !=null){
		p=p.next;
		q=q.next;
		}
		p.next = q.next;
		Node k=q;
		System.gc();
		return head;
	}
	 public static void main(String[] args) {
	 	Node head=null;
Linkdelkey link=new Linkdelkey();
Node n1=new Node(12);
Node n2=new Node(23);
Node n3=new Node(66);
Node n4=new Node(78);
head=n1;
n1.next=n2;
n2.next=n3;
n3.next=n4;
 head=Delete(head,23);
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