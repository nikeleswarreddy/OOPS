package Lab1;
import java.util.Scanner;
public class perfectnumber {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int a;
	a=sc.nextInt();
	int sum=0;
	for(int i=1;i<a;i++)
	{
		if(a%i==0)
		{
			sum+=i;
		}
	}
	if(sum==a)
		System.out.println("Perfect number");
	else
		System.out.println("Not a perfect number");
	sc.close();
}
}