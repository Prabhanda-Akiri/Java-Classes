import java.util.Scanner;

class record{

    int s1,s2,s3,s4,s5;


    void sub(int a,int b,int c,int d,int e){

        s1=a;
        s2=b;
        s3=c;
        s4=d;
        s5=e;
    }

    int cal(record t){

        return t.s1+t.s2+t.s3+t.s4+t.s5;
    }
}

public class D{
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        record o[]=new record[5];
        int i;

        int a,b,c,d,e;
        for(i=0;i<5;i++)
        {
            o[i]=new record();
        System.out.println("enter 5 subject marks each out of 10 for Student"+ (i+1) +":");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        d=in.nextInt();
        e=in.nextInt();

        o[i].sub(a,b,c,d,e);
        }
        
        for(i=0;i<5;i++)

        {
            System.out.println("Total marks of Student"+ (i+1) +":    "+o[i].cal(o[i]));

        }
    }
}
