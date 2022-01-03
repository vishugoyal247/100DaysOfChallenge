package Day10;

public class BitwiseShortCircuitOperators
{
    public static void main(String[] args)
    {
        /*
        Bitwise Operators(&,|,^,~,!)
        & --> return true if both argument are true
        | --> return true if single argument are true
        ^ --> return true if both argument are different
        ~ --> return negation i.e. 2's complement
        ! --> return complement
        */

        System.out.println(4 &5);      //4
        System.out.println(4 | 5);      //5
        System.out.println(4 ^ 5);      //1
        System.out.println(true & false);
        //  we can use this operator in any value boolean,int.

        //  System.out.println(~true);    compile time error(operator ~ cannot be applied to boolean)
        System.out.println(~4);       //-(n+1)
        //  System.out.println(!4);       compile time error(cannot apply to int type)
        System.out.println(!true);    //false
        //  we can only use this on the boolean types.


        /*
        Short circuit Operators(&&,||)
        - not evaluate both only one argument if first one is false
        - applicable for boolean only
        */

        int x=10;
        if (++x < 10 && (x/0 > 10))
        {
            System.out.println("Hello");
        }
        else
        {
            System.out.println("Hi");
        }                                 // Hi
    }
}