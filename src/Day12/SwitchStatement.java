package Day12;

import java.util.Scanner;

public class SwitchStatement
{
    public static void main(String[] args)
    {
        /*
                Switch case is used in place of the if else statement becoz it increase the code redibility4
                allowed arguments are
                byte,short,char,int till 1.4 version
                Byte, short, Character, Integer,enum till 1.6 version
                all above and string also 1.7 version above




                NOTE:

                const. expression
                The value should be in the range of switch argument type
                duplicate case level are not allowed.
                curly brackets are mandatory in switch statement
                without case label statement can't write
                only constants are allowed in case label not allowed variables.
                we can use final variable in case label\
                arg and case label both are expression but constant expression


         */

        // 1. syntax familiar
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your friend name : ");
        String a = sc.next();
        switch (a)
        {
            case "vishu" :
                System.out.println("your friend name is vishu");
                break;
            case "arnav" :
                System.out.println("your friend name is arnav");
                break;
            case "etisha" :
                System.out.println("your friend name is etisha");
                break;
            default:
                System.out.println("don't know who is he or she? ");
        }


        // 2. you can also write the above code like that
        System.out.println("Enter your friend name : ");
        String b = sc.next();
        switch (b)
        {
            case "vishu" -> System.out.println("your friend name is vishu");
            case "arnav" -> System.out.println("your friend name is arnav");
            case "etisha" -> System.out.println("your friend name is etisha");
            default -> System.out.println("don't know who is he or she? ");
        }

        // 3. curly brackets are mandatory in switch statement
        switch (b)
        {
            //both case and default are optional
        }

        //4. without case label statement can't write
//        switch (b)
//        {
//            System.out.println("hello");  // statement must be prepended with the class level
//        }

        //5. only constants are allowed in case label not allowed variables.
//        int x = 10;
//        int y = 20;
//        switch (x)
//        {
//            case 10 :
//                System.out.println("10");
//                break;
//            case y  :                              // variables are not allowed
//                System.out.println("20");
//                break;
//        }


        //6.  In the above problem if we use final keyword then we will use that variable as a case label.
        int x = 10;
        final int y = 20;
        switch (x)
        {
            case 10 :
                System.out.println("10");
                break;
            case y  :                              // variables are not allowed
                System.out.println("20");
                break;
        }

        //7. arg and case label both are expression but constant expression
        int z =10;
        switch (z+10)
        {
            case 10 :
                System.out.println("10");
                break;
            case 10+10 :
                System.out.println("20");
                break;
            default:
                System.out.println("don't know");
        }

        // 8. out of range case label
//        byte by = 10;
//        switch (by)
//        {
//            case 10 :
//                System.out.println("10");
//                break;
//            case 100 :
//                System.out.println("100");
//                break;
//            case 1000 :                           // provided int requierd byte
//                System.out.println("1000");
//                break;
//            default:
//                System.out.println("nothing");
//        }


        // 9. we can solve the above error
        byte by = 10;
        switch (by)
        {
            case 10 :
                System.out.println("10");
                break;
            case 100 :
                System.out.println("100");
                break;
            case (byte) 1000 :
                System.out.println("1000");
                break;
            default:
                System.out.println("nothing");
        }


        //10. max of ( int, int , byte )
        byte bv = 9;
        switch (bv+1)     // max of ( int, int , byte )
        {
            case 10 :
                System.out.println("10");
                break;
            case 100 :
                System.out.println("100");
                break;
            case 1000 :                           // this is valid becox arg is of int type
                System.out.println("1000");
                break;
            default:
                System.out.println("nothing");
        }


        // 11. duplicate labels are allowed
//        int n = 10;
//        switch (n)
//        {
//            case 97 :
//                System.out.println("97");
//                break;
//            case 98 :
//                System.out.println("98");
//                break;
//            case 'a' :                            // duplicate labels are not allowed
//                System.out.println("a");
//                break;
//            default:
//                System.out.println(" dont know about it");
//        }





    }

}
