//stack using linkedlist
class Stacklink
{
	static Node top=null;
	int isempty()
	{
      if(top==null)
      	return 1;
      else
      	return 0;
	}
	int  isfull()
	{
		Node p=new Node(12);
		if (p==null) {
			return 1;
		}
		else
		{
			return 0;
		}
	}
	static Node  push( int d)
	{
				Node p=new Node(d);
		if(p==null)
		{
			System.out.println("stack is oveflow");
		}
		else
		{
		p.next=top;
		top=p;
		}
		return top;
	}
	static Node pop()
	{
		if(top==null)
		{
			System.out.println("stack is empty");
		}
		else
		{
			Node l=top;
			top=top.next;
			Node q=l;
			System.gc();
		}
		return top;
	}
	static void show()
	{
		Node k=top;
		while(k !=null)
		{
			System.out.println(" "+k.data);
			k=k.next;
		}
	}
	public static void main(String[] args) {
      
      push(12);
      push(23);
      push(44);
      push(67);
      push(88);
      pop();
      pop();
     
      show();

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