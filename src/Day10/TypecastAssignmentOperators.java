package Day10;

public class TypecastAssignmentOperators
{
    public static void main(String[] args)
    {
        /*
        Typecast
        - Implicit (automatic convert from lower to higher(compiler),no loss of data,widening)
        - Explicit (not automatic,loss of data,narrowing)
        */

        //  Typecast(implicit)
        int x = 'a';
        System.out.println(x);
        //  Typecast(explicit)
        int y = 130;
        //  byte b=y;                          possible loss of precision
        byte b = (byte) y;                 // 2's complement
        System.out.println(b);


        /*
        Assignment Operators
        */

        //  simple:
        int a = 10;
        System.out.println(a);
        //  chained:
        int c,d;
        int e=c=d=40;
        System.out.println(e);
        System.out.println(c);
        System.out.println(d);
        //  compound: - (+=,-=,*=,/=,%=)
        //            - (&=,|=,^=)
        //            - (>>=,>>>=,<<=)
        a+=20;
        System.out.println(a);               // internal type casting done automatically
        byte f = 10;
        //  f=f+1;                               // compile time error
        f++;                                 // f=(byte)(f+1)
        f+=1;                                // f=(byte)(f+1)
        System.out.println(f);
        a+=b-=c*=d/=2;
        System.out.println(a+" "+b+" "+c+" "+d);

    }
}
