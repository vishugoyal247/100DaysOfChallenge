package Day6;

public class LocalVariable
{
    public static void main(String[] args)
    {
        /*
            Local variable:  Sometime to meet the temp. requirement of the programmer we declare variable inside a method,
                             block, constructor such type of the variable are called local, temp, stack, automatic variables
                             local variables stored stack memory
                             while execution the block the local variable create and destroy when the block will execute.
                             The scope of the local variable will only till the block execution complete.
                             It is recommended to initialize a local variable before we use it.

         */

        int x;
        int y = 10;
        //System.out.println(x);      //CE: variable x might have not been initialized
        System.out.println(y);
        x = 20;                       //Now variable x have been initialized before we use it.
        System.out.println(x);

    }

}
