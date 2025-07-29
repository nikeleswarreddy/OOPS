package Lab1;
import java.util.Scanner;
public class program3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		double x;
		System.out.println("enter the number");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			x=Math.sqrt(i);
			System.out.println("the square root of "+i+" is "+x);
		}
		sc.close();
	}
}