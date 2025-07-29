package Lab1;
import java.util.Scanner;
public class program1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int GST;
	System.out.println("Enter the gst amount");
	GST=sc.nextInt();
	int maintainance;
	int discount;
	System.out.println("Enter the maintainance amount");
	maintainance=sc.nextInt();
	int bill;
	System.out.println("Enter the billed amount");
	bill=sc.nextInt();
	int total_bill=bill+GST+maintainance;
	if(bill>=1000)
	{
		discount=(bill/100)*10;
	}
	else
	{
		discount=(bill/100)*5;
	}
	int total=total_bill-discount;
	System.out.println("Bill amount before discount is :"+bill);
	System.out.println("GST amount is:"+GST);
	System.out.println("Maintainance amount is:"+maintainance);
	System.out.println("Discount amount is:"+discount);
	System.out.println("Total bill after discount is:"+total);
	sc.close();
}
}
