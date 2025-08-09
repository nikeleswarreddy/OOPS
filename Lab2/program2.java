package Lab2;
import java.util.Scanner;
public class program2 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first string");
	String a=sc.nextLine();
	System.out.println("Enter the second string");
	String b=sc.nextLine();
	System.out.println(a.equals(b));
	System.out.println(a==b);
	sc.close();
}
}