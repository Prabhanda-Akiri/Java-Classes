import java.util.Scanner;

final class a extends b
{
    
    a(int a,int b)
    {
        super(a,b);
        
    }
    int mul()
    {
        return x*y;
        
    }
}

abstract class b
{
    int x,y;
    
    b(int c,int d)
    {
        x=c;
        y=d;
    }
    
    abstract int mul();
    
    final int add()
    {
        return x+y;
    }
    
}

public class E
{
    public static void main(String[] args)
    {
       a ob=new a(4,3);
       
       System.out.println("product from normal method in final class: " + ob.mul() );
       System.out.println("sum from final method in normal class: " + ob.add());
    }
}
