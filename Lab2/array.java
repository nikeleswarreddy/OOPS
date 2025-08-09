package Lab2;
import java.util.Scanner;
public class array {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n,temp;
	System.out.println("Enter the number of elements");
	n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter the elements in an array");
		a[i]=sc.nextInt();
	}
	int x=a[0];
	for(int i=0;i<n;i++)
	{
		if(x<a[i]) {
			temp=a[i];
		    a[i]=x;
		    x=temp;
		}
	}
	System.out.println("the maximum value is: "+x);
	int y=a[0];
	for(int i=0;i<n;i++)
	{
		if(y>a[i])
		{
			temp=a[i];
			a[i]=y;
			y=temp;
		}
	}
	System.out.println("The minimum value is: "+y);
		sc.close();
}
}
