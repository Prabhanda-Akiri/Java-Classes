import java.util.Scanner;

class numbers{
    
    int a,b,temp=0;
    
    void swap(numbers ob)
    {
        temp=ob.a;
        a=ob.b;
        b=temp;
        
    }
    
}

public class C
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=in.nextInt();
        
        System.out.println("Enter b:");
        int b=in.nextInt();
        
        numbers n=new numbers();
        n.a=a;
        n.b=b;
        n.swap(n);
        
        System.out.println("after swapping\na: "+ n.a +"\nb: "+ n.b);
        
    }
}
