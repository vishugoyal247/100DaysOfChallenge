package Day7;

public class VarArgMethods
{

        /*
            Variable Arguments (Varargs) in Java is a method that takes a variable number of arguments.
            Variable Arguments in Java simplifies the creation of methods that need to take a variable number of arguments.
         */

        // Takes string as a argument followed by varargs
        static void fun2(String str, int... a)
        {
            System.out.println("Name: " + str);
            System.out.println("Number of arguments is: " + a.length);

            // using for each loop to display contents of a
            System.out.print("Elements in var-args array : ");
            for (int i : a)
                System.out.print(i + " ");

            System.out.println();
        }

        public static void main(String[] args)
        {
            // Calling fun2() with different parameter
            fun2("Vishu", 100, 200);
            fun2("Arnav", 1, 2, 3, 4, 5);
            fun2("Etisha");
        }

}
