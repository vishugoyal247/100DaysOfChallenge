package Day13;

public class ForStatement
{
    public static void main(String[] args)
    {
        /*
                For loop :
                for(initialize; conditional; increament)
                {
                        body;
                }
         */

        //   1.
        for (int i = 0; true ; i++)
        {
            System.out.println("hello");
        }

        //  2.
        for (int i = 0; i < 10 ; i++);


        //  3.
        for (int i = 0; i < 10 ; i++)
            System.out.println("hello");

        //  4.
//        for (int i = 0; i < 10 ; i++)
//            int x = 10;    // declaraive statement not allowed

        //  5.

        for (int i = 0; i <10; i++)
        {
            System.out.println(i);
        }

        // 6.
        for ( ;  ; )
        {
           // all the field are optional
           // conditional field is default is trye.

        }


        // 7.
        int i=0;
        for(System.out.println("hello"); true; System.out.println("bie"))
        {

            System.out.println("body");

            i++;
        }







    }
}
