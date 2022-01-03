package Day10;

public class OperatorPrecedence
{
    public static void main(String[] args)
    {

       /*
       unary operator        - most
       Binary operator
       Ternary operator
       Assignment operator   - least
       */

        /*
        Precedence--

        1. Unary Operator
        [] ,x++,x--,++x,--x,~,!,new,<type>

        2. Arithmetic Operator
        *, /,%,+,-

        3. Shift Operator
        >>,>>>,<<

        4. Comparison Operator
        <,<=,>,>=,instanceof

        5. Equality Operator
        ==,!=

        6. Bitwise Operator
        &,^,|

        7. Short Circuit Operator
        &&,||

        8. Conditional Operator
        ? :

        9. Assignment Operator
        =,+=,-=,*=

        */

        int a=1,b=2,c=3,d=4,e=5,f=6;
        System.out.println(++a*b);
        System.out.println(c+=d);
        System.out.println(c);
        System.out.println(d);
        System.out.println(m1(1)+m1(2)*m1(3)/m1(4)+m1(5)*m1(6));
    }
    public static int m1(int i)
    {
        System.out.println(i);
        return i;
    }
    // In java,only we have operator precedence not an operand precedence
    // Before apply any operator all operand evaluated(left to right)

}