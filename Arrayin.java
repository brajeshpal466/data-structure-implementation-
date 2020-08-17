import java.util.*;
//insert of element in particular location
class Array3
{   
  // insertion on element at index 
    static int  insert(int k,int in ,int a [],int size,int cap)
	{
		if(size>=cap)
		{
			return -1;
		}
		else
		{
		
		for(int i=size-1;i>=in;i--)
		{
			a[i+1]=a[i];
		}
		a[in]=k;
		return 1;
		}
	}
	 // travesal of array
	void display(int arr [],int size)
	{
			for(int i=0;i<size;i++)
		{
			System.out.println("/n"arr[i]);
		}
	}
public static void main(String ar[])
{
	Array3 ob=new Array3();
	
	Scanner ss=new Scanner(System.in);
int arr []=new int[10] ;
int cap=arr.length;
int size=5;
for(int i=0;i<size;i++)
{
	arr[i]=i;
}

System.out.println("enter the key for insertion");
int key=ss.nextInt();
System.out.println("enter the index for insertion");
int index=ss.nextInt();
ob.insert(key,index,arr,size,cap);
size+=1;
ob.display(arr,size);
}
}