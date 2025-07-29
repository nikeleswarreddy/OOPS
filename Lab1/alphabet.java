package Lab1;
import java.util.Scanner;
public class alphabet {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	char ch;
	ch=sc.next().charAt(0);
	if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
		System.out.println("Alphabets");
	else
		System.out.println("Not alphabets");
	sc.close();
}
}
