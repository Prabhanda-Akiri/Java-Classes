import java.util.Scanner;

class Library{

	String name,author;
	static String lib;

	Library()
	{
	 lib="NITK Library";
	}

	static{

		System.out.println("**********WELCOME TO NITK LIBRARY***********");
	}

	void novels(String a,String b)
	{
		name=a;
		author=b;
	}

	void science(String a,String b)
	{
		name=a;
		author=b;
	}
}

public class B{

	public static void main(String[] args){

		int i,j,k;
		String a,b;
		System.out.println("Enter the number of books to be included in the novels genre");
		Scanner in=new Scanner(System.in);
		int p=in.nextInt();
		Library n[]=new Library[p];

		for(i=0;i<p;i++)
		{
			n[i]=new Library();
			System.out.println("enter book name");
			a=in.next();
			System.out.println("enter author name");
			b=in.next();
			n[i].novels(a,b);
		}

		System.out.println("Enter the number of books to be included in the science genre");
		
		int q=in.nextInt();
		Library s[]=new Library[q];

		for(i=0;i<q;i++)
		{
			s[i]=new Library();
			System.out.println("enter book name");
			a=in.next();
			System.out.println("enter author name");
			b=in.next();
			s[i].science(a,b);
		}

		System.out.println("books in novel genre :" + p);

		for(i=0;i<p;i++)
		{
			System.out.println("book "+(i+1)+":");
			System.out.println("Name: " + n[i].name);
			System.out.println("Author: " + n[i].author);
			System.out.println("Library: " + n[i].lib);
		}

		System.out.println("books in Science genre :" + q);

		for(i=0;i<q;i++)
		{
			System.out.println("book "+(i+1)+":");
			System.out.println("Name: " + s[i].name);
			System.out.println("Author: " + s[i].author);
			System.out.println("Library: " + n[i].lib);
		}
	}
}
