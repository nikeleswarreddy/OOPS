package LAB3;
import java.util.Scanner;
public class program2 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name");
	String a=sc.nextLine();
	for(int i=0;i<a.length();i++)
	{
		System.out.println(a.charAt(i));
	}
	sc.close();
}
}
