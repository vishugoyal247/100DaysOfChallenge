package Day13;

public class WhileStatement
{
    public static void main(String[] args)
    {
        /*
             While is the iterative statement
             we will use this statement when we don't know about the no. of the iterations
         */

        // syntax
//        while( <boolean type> )   // if we are provide other type of arg then we will get compile time error.
//        {
//            Action
//        }


        // 1. not valid Unreachable statement
//        while(true)
//        {
//            System.out.println("hello");
//        }
//        System.out.println("bye");              //Unreachable statement



        // 2. not valid { bracket are not unreachable }
//        while(false)
//        {
//            System.out.println("hello");   // Unreachable statement
//        }
//        System.out.println("bye");


        // 3. In case of variable jvm doesn't able to check it is reachable or not.
        int a = 10, b = 20;
        while (a<b)
        {
            System.out.println("hello");
        }
        System.out.println("bye");


        //4. In case of variable JVM doesn't able to check it is reachable or not.
        int c = 10, d = 20;
        while (c>d)
        {
            System.out.println("hello");
        }
        System.out.println("bye");


        // 5. Unreachable statement because they are treating with final variable
//        final int e = 10, f = 20;
//        while (e<f)
//        {
//            System.out.println("hello");
//        }
//        System.out.println("bye");




//        Conclusion:
        /*
                Every final variable can be replaced by the value const. becoz it will be same in the last of the program.
         */

        final int x=10, y=20;
        int z=30;
                                                   // after compile the code
        System.out.println(x+y);       //  --->    sout(30);
        System.out.println(x+z);       //  --->    sout(10+z);
        System.out.println(x<y);       //  --->    sout(true);
        System.out.println(x>z);       //  --->    sout(10>z);




    }
}
