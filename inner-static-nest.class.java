import java.util.Scanner;

class a{

    static int l=5;
    static int w=6;

    int x=4;
    int y=6;
    int z=2;

    static class b{

        static int area(){

            return l*w;
        }
    }

    class c{

        int vol(){

            return x*y*z;
        }
    }
}

public class E{

    public static void main(String[] args){

        a o=new a();
        a.b o1=new a.b();
        a.c o2=o.new c();

        System.out.println("the area printed from static-nested class b is " +o1.area()+"sq.units");

        System.out.println("the volume printed from inner class c is  " +o2.vol()+"cubic.units");



    }
}
