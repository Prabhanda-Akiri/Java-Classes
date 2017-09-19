import java.util.Scanner;

class Shapes{
    
    int a,b,c,d,e,f,g;
    
    Shapes()
    {a=5;}
    
    Shapes(int p)
    {a=p;}
    Shapes(int p,int q)
    { a=p;
      b=q;}
      
    double sq(Shapes c)
    {
        return (double)c.a*c.a;
    }
    double cu(Shapes c)
    {
        return (double)6*c.a*c.a;
    }
    double rect(Shapes c)
    {
        return (double)c.a*c.b;
    }
    double sp(Shapes c)
    {
        return (double)4*3.14*c.a*c.a;
    }
    double cy(Shapes c)
    {
        return (double)2*3.14*c.a*c.b;
    }
}


public class E {
    public static void main(String args[]) {
        
        Scanner in=new Scanner(System.in);
        
        double a=0;
        System.out.println("Select an object:\n1.Square\n2.Cube\n3.Rectangle\n4.Sphere\n5.Cylinder");
        int k=in.nextInt();
        switch(k)
        {
            case 1: System.out.println("enter side-length");
                    int p=in.nextInt();
                    Shapes o=new Shapes(p);
                    a=o.sq(o);
                    break;
            case 2: System.out.println("enter side-length");
                    p=in.nextInt();
                    o=new Shapes(p);
                    a=o.cu(o);
                    break;
            case 3: System.out.println("enter length,breadth");
                    p=in.nextInt();
                    int q=in.nextInt();
                    o=new Shapes(p,q);
                    a=o.rect(o);
                    break;
            case 4: System.out.println("enter radius");
                    p=in.nextInt();
                    o=new Shapes(p);
                    a=o.sp(o);
                    break;
            case 5: System.out.println("enter radius and height");
                    p=in.nextInt();
                    q=in.nextInt();
                    o=new Shapes(p,q);
                    a=o.cy(o);
                    break;
            
        }
        
        System.out.println("The area of the object is: "+ a +"sq.units");
    }
}
