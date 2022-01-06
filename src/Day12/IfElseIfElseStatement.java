package Day12;

import java.util.Scanner;

public class IfElseIfElseStatement
{
    public static void main(String[] args)
    {
        // 1.  Normal if else statement
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        if(b == 3 )
        {
            System.out.println("Three");
        }
        else if(b == 4 )
        {
            System.out.println("Four");
        }
        else
        {
            System.out.println("neither 3 nor 4 ");
        }



        //2.   should be of boolean type only
        int a = 1;
//        if(a)   // required boolean provided int
//        {
//            System.out.println("Boolean statement is true");
//        }
//        else
//        {
//            System.out.println("Boolean statement is false");
//        }


        //3. statement should be boolean type not int
//        int x = 10;
//        if( x = 20 )
//        {
//            System.out.println("Hello");
//        }
//        else
//        {
//            System.out.println("Hi");
//        }



        //4.  statement is boolean
        boolean c = false;
        if(c = true)
        {
            System.out.println("hello");
        }
        else
        {
            System.out.println("hi");
        }



        //5. always true
        if(true)
        {
            System.out.println("hello");
        }


        //6. always false
        if(false)
        {
            System.out.println("hi");
        }

        //7. not valid
//        if( true)
//            int x = 10;    // not allowed here becoze it is the only single statement and x never used in local scope so it is waste

        //8. valid
        if(true)
        {
            int x =10;
        }


        // 9. Dangling else problem is not in java, Java is strong in that case it will find nearest if statement condition.
        if(true)
            if(false)
                System.out.println("hello");
        else
            System.out.println("hi");






    }
}
