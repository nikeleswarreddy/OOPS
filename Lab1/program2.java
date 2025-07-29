package Lab1;
import java.util.Scanner;
public class program2 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter 1st number");
		a=sc.nextInt();
		System.out.println("Enter 2nd number");
		int b;
		b=sc.nextInt();
		System.out.println("Before swapping a:"+a);
		System.out.println("Before swapping b:"+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping a:"+a);
		System.out.println("After swapping b:"+b);
		sc.close();
		
	}
	}
