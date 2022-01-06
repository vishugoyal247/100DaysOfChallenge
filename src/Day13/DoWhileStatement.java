package Day13;

public class DoWhileStatement
{

    public static void main(String[] args)
    {


        /*
         // syntax
            do
            {
                body
            }while( <boolean statement> );

            semicolon and boolean statement is mandatory...

         */



        // 1. Always true do while loop
        do
        {
            System.out.println("hello");
        } while (true);




        // 2. Always false do while loop
//        do
//        {
//            System.out.println("hello");
//        } while (false);



        // 3.  do while loop have an empty body.
//        do;
//        while(true);

        // 4.
//        do                  // do statement doesn't have the loop
//        while(true);


        // 5.
//        do
//            int x = 10;         // declaration not allowed here.
//        while(true);


        // 6.
//        do
//            System.out.println("hello");
//        while(true);


        // 7. Dangling problem is not there
//        do while (true)
//        System.out.println("hello");
//        while (false);


        // After compile the above code it will be like this .
//        do
//            while(true)
//                System.out.println("hello");
//        while(false);

    }
}
