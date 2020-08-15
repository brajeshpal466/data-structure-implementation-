import java.util.*;
class Array3
{
    static void insert(int k,int in ,int a [],int size)
	{
		++size;
		for(int i=size-1;i>=in;i--)
		{
			a[i+1]=a[i];
		}
		a[in]=k;
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
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
System.out.println(size);
System.out.println(cap);
System.out.println("enter the key for insertion");
int key=ss.nextInt();
System.out.println("enter the index for insertion");
int index=ss.nextInt();
ob.insert(key,index,arr,size);
}
}