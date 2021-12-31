package Day7;

public class MainMethod
{
    /*
         public static void main( String[] args)

         public : to call by JVM anywhere
         static : without existing the object of the main class JVM has to call this method
         void   : it won't return anything to the JVM
         main   : This is the name of the method which is configured inside the JVM
         args   : Command line args of String Array type

     */


    // Overloading concept : it occurs within the class.

    public static synchronized strictfp void main(String[] args)
    {
        System.out.println("Parent String Main");
    }
    public static synchronized strictfp void main(int[] args)
    {
        System.out.println("int Main");
    }
    public static void main(char[] args)
    {
        System.out.println("Char Main");
    }


}

/*
       when we create a method with same name and its argument with different class then the concept is
       known as the overriding but when we declare the method as static as it is known as hiding not overriding.
 */

class ChildMethod
{
    public static void main(String[] args)               //  Method hiding not overriding
    {
        System.out.println("Child String Main");

    }
}

/*
        Inheritance concept will be applicable for main method also...
 */

class test extends MainMethod
{
    public static void main(String[] args)
    {
        System.out.println("Inheritance Concept");
    }
}


