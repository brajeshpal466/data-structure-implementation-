// stack implemrntation using stack
class Stackarray
{
	 static int stack1 [];
	static int top;
	static int size;
	Stackarray()
	{
		size=100;
		top=-1;
		stack1=new int [size];
	}
	static boolean isoverflow()
	{
		return(size==top-1);
	}
	static int push(int d)
	{
    if(isoverflow())
    	return 0;
    else
    { 
     stack1[++top]=d;
     System.out.println("inserted element is :"+stack1[top]);
     return 1;
    }
 }
 static int pop()
 {
 	if(top<0)
 		return 0;
 	else

 	System.out.println("element is poped :"+stack1[top]);
  		top=top-1;
 	return 1;
 }
     static void show()
     {
     	for(int i=top;i>=0;i--)
     	{
     		System.out.println(stack1[i]);
     	}
     }
	public static void main(String[] args) {
		Stackarray st=new Stackarray();
      push(12);
       push(34);
       push(55);
        push(45);
        push(25);
        push(95);
      pop();
      pop();
      System.out.println("updtaed stack is \n");
      show();
	}
}
