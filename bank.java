import java.util.Scanner;

abstract class bank{

	int dep,wit,bal;

	bank()
	{
		bal=0;
	}

	void depo(int a){

		dep=a;

	}

	void with(int a)
	{
		wit=a;
	}

	abstract int cal();
}

class sbi extends bank
{
	sbi()
	{
		super();
	}
	int cal()
	{
		bal=bal+dep-wit;

		return bal;
	}
}

public class B{

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);

		sbi s=new sbi();
		System.out.println("Enter the deposit amount:");
		int a=in.nextInt();
		s.depo(a);

		System.out.println("Enter the withdrawl amount:");
		int b=in.nextInt();
		s.with(b);

		System.out.println("Your balance is: Rs." + s.cal() + ".00/- only");


	}
}
