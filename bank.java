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

	abstract void cal();
}

class sbi extends bank
{
	void cal()
	{
		bal=bal+dep-wit;
	}
}

public class bal{

	public static void main(String[] args)
	{
		
	}
}
