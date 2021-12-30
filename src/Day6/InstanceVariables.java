package Day6;

public class InstanceVariables
{
    /*
    Instance Variable : This variable is declare inside the Class scope and other the Method,block and constructor.
                        This instance variable value is vary object to object level.
                        for every object a sep. copy of variable will be created.
                        The scope of the instance variable is same as the same as the scope of the object.
                        It is stored in Heap Memory or to the top of the object.
                        We can't  assigned the value to the instance variable by default JVM provide the default value.

     */

    int x;            // Instance variable with by default 0 value.
    String name;      // Instance variable with by default null value.
    boolean b;


    public static void main(String[] args)
    {

         /*
            Static Area

            we can't access the instance variable inside the static area directly, but we can access that instance variable
            with the object reference...

         */

        InstanceVariables obj = new InstanceVariables(); // Object creation

        System.out.println(obj.x);                       // we can access the x instance variable by the help of the object reference

        obj.name = "Vishu Goyal";                        // assign to customize value the instance name variable
        System.out.println(obj.name);                    // we can access the name instance variable by the help of the object reference.

    }

    // Instance area
    {
        /*
                we can access the instance variable inside the instance area directly without any restriction...
         */

        name = "Etisha Jain";        //assign to customize value the instance name variable
        b = true;                    //assign to customize value the instance b variable
        System.out.println(name);
        System.out.println(b);
    }


}
