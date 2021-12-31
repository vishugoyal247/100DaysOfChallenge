package Day8;

public class CommandLineArgs
{
    public static void main(String... args)
    {

        /* Ways to convert String to Integer
           Integer i = Integer.parseInt(args[0]);
           Integer j = Integer.valueOf(args[1]);
        */


        int sum = 0;
        for (String ele : args )
        {
            sum += Integer.parseInt(ele);
        }

        System.out.println("Sum of the all command line argument is : "+sum);

    }

}
