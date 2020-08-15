// deletion of element from particuler location
import java.util.*;
class Array4
{
    static void insert(int in ,int a [],int size)
	{
		--size;
		for(int i=size-1;i>=in;i--)
		{
			a[i]=a[i+1];
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}
public static void main(String ar[])
{
	Array4 ob=new Array4();
	
	Scanner ss=new Scanner(System.in);
int arr []=new int[10] ;
int cap=arr.length;
int size=5;
for(int i=0;i<size;i++)
{
	arr[i]=i;
}
System.out.println(size);
System.out.println(cap);
//System.out.println("enter the key for insertion");
//int key=ss.nextInt();
System.out.println("enter the index for insertion");
int index=ss.nextInt();
ob.insert(index,arr,size);
}
}