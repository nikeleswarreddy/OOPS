package LAB3;
import java.util.Scanner;
public class program1 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	String a=sc.nextLine();
	StringBuilder sb=new StringBuilder(a);
	String b=sb.reverse().toString();
	if(a==b)
		System.out.println("Palindrome string");
	else
		System.out.println("Not a Palindrome string");
	sc.close();
}
}
