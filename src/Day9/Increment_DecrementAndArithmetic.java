package Day9;

public class Increment_DecrementAndArithmetic
{

    public static void main(String[] args)
    {
        /*
        Increment-Decrement Operators
        - Applicable only for variable not constant
        - for final variable these are not allowed
        - we can apply every type except boolean
        - b++ , b= b+1 are different from each other
        */
        int x = 10;
        //  int y = ++10;                 compile time error ( increment-decrement apply only with variables )
        int y = ++x;
        System.out.println(y);
        //  int z = ++(++x);

        final int a = 10;
        //  a = 11;
        //  a++;                          compile time error ( cannot assign value to a variable final )

        int b = 10;
        b++;
        System.out.println(b);
        char c = 'a';
        c++;
        System.out.println(c);
        double d = 10.5;
        d++;
        System.out.println(d);
        boolean e = false;
        //  e++;                           compile time error ( increment-decrement valid for all datatypes except boolean )

        //If we apply arithmetic operator between two variable p and q the result type is max of(int,type of p,type of q)
        byte p = 10;
        byte q = 20;
        //  byte r = p+q;                  compile time error ( so return type will be int )
        byte r =(byte)(p+q);
        System.out.println(r);
        //  r=r+1;                         compile time error
        r++;                           // b = type of r(r+1)
        System.out.println(r);


    /* Arithmetic Operators
    - If we apply this operator between two variable p and q the result type is max of(int,type of p,type of q)
       e.g. byte + byte =int , long + double = double
    - float and double contains two constants POSITIVE_INFINITY and NEGATIVE_INFINITY
    */
        long l = 10;
        double f = 12.5;
        System.out.println(l+f);
        System.out.println(10/0);                 // runtime error: arithmetic exception / by zero
        System.out.println(10/0.0);               // Infinity
        System.out.println(-10/0.0);              // -Infinity
        System.out.println(0/0);                  // runtime error : arithmetic exception / by zero
        System.out.println(0.0/0);                // NaN
        System.out.println(0/0.0);                // NaN
        System.out.println(0.0/0.0);              // NaN
        System.out.println(10<=Float.NaN);        //false
        System.out.println(10> Float.NaN);        //false
        System.out.println(10==Float.NaN);        //false
        System.out.println(Float.NaN==Float.NaN); //false
        System.out.println(10!=Float.NaN);        //true
        System.out.println(Float.NaN!=Float.NaN); //true
        /*
        Arithmetic Exception
        - Runtime Exception
        - possible in int not in floating point
        - operators which cause Arithmetic Exception are division and modulus
        */

    }
}
