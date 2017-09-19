import java.util.Scanner;

public class A{

    public static void main(String[] args){

        Scanner in=new Scanner(System.in);
        System.out.println("enter three products");
        String p1=in.next();
        String p2=in.next();
        String p3=in.next();
        
        System.out.println("Products are:\n1."+p1+"\n2."+p2+"\n3."+p3+"\n");
        int i,j,k;
        double s=0;
        System.out.println("quantity of p1 required:\n");
        i=in.nextInt();
        s=s+pro.pr1(i);

        System.out.println("quantity of p2 required:\n");
        j=in.nextInt();
        s=s+pro.pr2(j);

        System.out.println("quantity of p3 required:\n");
        k=in.nextInt();
        s=s+pro.pr3(k);


        System.out.println("Your bill is: Rs." +s+"/- only" );
    }
}

class pro{

    static double r1=45.00;
    static double r2=23.00;
    static double r3=60.00;

    static double pr1(int k){
        return r1*k;

    }

    static double pr2(int k){
        return r2*k;
    }

    static double pr3(int k){
        return r3*k;
    }
}
