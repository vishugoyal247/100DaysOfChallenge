package Day9;

public class StringConcatenationAndRelational
{
    public static void main(String[] args)
    {
        /*
        - In Java, + operator provides operator overloading
        - If atleast one operand is string and other operand is anything then it would be String concatenation
        */

        String a = "Etisha";
        int b = 10;
        int c = 20;
        int d = 30;
        System.out.println(a+b+c+d);      // Etisha102030
        System.out.println(b+a+c+d);      // 10Etisha2030
        System.out.println(c+b+a+d);      // 30Etisha30
        System.out.println(c+b+d+a);      // 60Etisha
        //  a=b+c+d;                          compile time error
        a=a+b+c;
        //  b=a+c+d;                          compile time error
        b=b+c+d;
        System.out.println(a);            // Etisha1020
        System.out.println(b);            // 60


        /*
        Relational Operators (<,>,<=,>=)
        - Left to Right
        - Nesting of this is not allowed
        */

        System.out.println(10<20);              //true
        System.out.println('a'<10);             //false
        System.out.println('a'<97.8);           //true
        System.out.println('a'>'A');            //true
        //  System.out.println(true>false);         cannot apply to boolean
        //  System.out.println("durga123">"durga"); cannot apply to Object
        //  System.out.println(10<20<30);           cannot apply to boolean,int

    }
}
