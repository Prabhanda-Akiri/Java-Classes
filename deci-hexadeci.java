import java.util.Scanner;

public class C{

    public static void main(String[] args)
    {

        Scanner in=new Scanner(System.in);

        System.out.println("Decimal number:");
        int n=in.nextInt();
        int k,l,m,c=0;
        String s="";
        k=n;
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
 
        while(k>0)
        {
            l=k%16;
            s=s+hex[l];
            k=k/16;
                
            }

            System.out.println("Hexadecimal form of "+ n +" is "+s);
        }

    }
