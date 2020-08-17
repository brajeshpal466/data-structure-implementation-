// binary search  for sorted array
class Binarysearch
{
	int binarys(int a [],int key)
	{
		int low,mid,high;
		
		int size=a.length;
		low=0;
		high=size-1;
		while(low<=high)
		{
		mid=low+high;
		if(a[mid]==key)
			return mid;
		if(a[mid]<key)
		  low=mid+1;
	    else
			high=mid-1;
		}
		return -1;
	}
public static void main(String arr[])
{
int a []=new int [] {1,4,7,9,11,18,23,28,31};
Binarysearch ab=new Binarysearch();
int key=23;
int in=ab.binarys(a,key);
System.out.println(in);
}
} 