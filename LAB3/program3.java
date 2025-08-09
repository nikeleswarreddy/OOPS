package LAB3;
import java.util.Scanner;
public class program3 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	int count=0;
	for(int i=0;i<a.length();i++)
	{
		if(a.charAt(i)=='a'||a.charAt(i)=='A'||a.charAt(i)=='e'||a.charAt(i)=='E'||a.charAt(i)=='i'||a.charAt(i)=='I'||a.charAt(i)=='o'||a.charAt(i)=='O'||a.charAt(i)=='u'||a.charAt(i)=='U')
			count++;
	}
	System.out.println("Number of vowels is: "+count);
	sc.close();
}
}
