// deletion of element from particuler location
import java.util.*;
class Array4
{
    static int deletion(int in ,int a [],int size)
	{
		
		for(int i=in;i<size-1;i++)
		{
			a[i]=a[i+1];
		}
		return 1;
	}
		void display(int a [],int size)
		{
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

System.out.println("enter the index for deletion");
int index=ss.nextInt();
ob.deletion(index,arr,size);
size-=1;
ob.display(arr,size);
}
}