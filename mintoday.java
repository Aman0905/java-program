import java.util.*;
public class mintoday {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int min , year , days;
		System.out.println("Enter the minutes...");
		min =s.nextInt();
		int cn=60*24*365;
		year=min/cn;
		System.out.print(year+" years ");
		min=min-(year*cn);
		int cm=60*24;
		days=min/cm;
		System.out.print("and "+days+" days.");
	}
}