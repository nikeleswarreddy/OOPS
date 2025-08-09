package Lab2;
import java.util.Scanner;
public class program1 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	String a = sc.nextLine();
	System.out.println("Enter the index");
	int index;
	index=sc.nextInt();
	System.out.println("the charecter at index is: "+a.charAt(index));
	System.out.println("the length of the string is: "+a.length());
	System.out.println("String in upper case is: "+a.toUpperCase());
	System.out.println("String in lower case is: "+a.toLowerCase());
	System.out.println("enter the begin index for a sub string");
	int begin;
	begin=sc.nextInt();
	System.out.println("Enter the end of the sub string");
	int end;
	end=sc.nextInt();
	sc.nextLine();
	System.out.println("the substring is: "+a.substring(begin,end));
	System.out.println("enter a string");
	String b=sc.nextLine();
	boolean n=a.contains(b);
	System.out.println("the string a contains the string b: "+n);
	String replaced=a.replace('l','o');
	System.out.println("the replaced string is: "+replaced);
	sc.close();
}
}
