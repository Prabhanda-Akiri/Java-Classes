
import java.util.Scanner;

class employee{

	int id,att,hrs;
	double salary;
	String name;

	employee(String a,int b)
	{
		name=a;
		id=b;
	}
}

class apprisal extends employee{

	apprisal(String a,int b){
		super(a,b);
	}

	String app(int a,int b)
	{
		att=a;
		hrs=b;

		if(b>6 || a>80)
		{
			return "Good!!..\nYou work alot..";
		}

		else
		{
			return "You have to improve your work\nBetter luck next time";
		}
	}
}

class payroll extends apprisal{

	payroll(String a,int b){
		super(a,b);
	}

	int pay()
	{
		return 250*hrs*30;
	}
}

public class A{

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);

		System.out.println("Name:");
		String n=in.next();
		System.out.println("Employee-Id:");
		int i=in.nextInt();

		payroll e=new payroll(n,i);

		System.out.println("Working Hours:");
		int b=in.nextInt();
		System.out.println("Attendance:");
		int a=in.nextInt();

		System.out.println(e.app(a,b));

		System.out.println("Your salary is: Rs." + e.pay() + ".00/-");

	}
}
