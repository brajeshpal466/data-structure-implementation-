// queue in java
class Queuearr
{
int que [] ;
int front,rear;
int size;
Queuearr()
{
	que=new int[100];
	front=rear=-1;
	size=0;

}
int enqueue(int ele)
{
if(size==que.length)
	return 0;
else{
	if(isempty())
	{
		++front;
		que[++rear]=ele;
	size=size+1;
	}
	else
	{
	que[++rear]=ele;
	size=size+1;
    }
    return 1;
}
}
int dequeue()
{
	if(size==0)
		return 0;
	else
	{
	System.out.println("delete element :"+que[front]);
	front=front+1;
	
	size=size-1;
	return 1;
}
}
boolean isempty()
{
return(size==0);
}
void show()
{
	for (int i=front;i<=rear ;i++ ) {
	   System.out.println(" "+que[i]);
	}
}
	public static void main(String[] args) {
		Queuearr queue=new Queuearr();
		queue.enqueue(12);
		queue.enqueue(13);
		queue.enqueue(15);
		queue.dequeue();
		queue.show();
	}
}