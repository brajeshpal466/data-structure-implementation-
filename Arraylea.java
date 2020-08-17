// linear search of array
import java.util.*;
class Arraylea
{
	int leaner(int a[],int size,int ele)
	{
		for(int i=0;i<size;i++)
		{
			if(a[i]==ele)
				return i;
			else
				return -1;
		}
		return 1;
	}
	public static void main(String ar [])
	{
	int arr []=new int [] {12,54,51,13,25,17};
Scanner sc=new Scanner(System.in);
      Arraylea ln=new Arraylea();
	  int ele=sc.nextInt();
    if(int ln.leaner(arr,arr.length,ele)==-1)
	System.out.println("not found")	
System.out.println(ind);	
	}
}