package Day6;

public class StaticVariable
{
    /*
        Static Variable: if the variable is not varied from object to object not declared instance so we can declared
                         such variable with  the static keyword and are known as static variable......
                         In Static variable, do not create a seperate variable for every object, a single entity
                         is created and shared to all the object of the class...
                         Static variable should be declared  inside the class and outside the method, block and constructor...
                         Static variable is created at the time of the class loading and destroying at the time of the unloading
                         and hence scope of the static variable is same as the scope of the .class file...
                         Static variable is stored on the Stack memory...
                         Static area will execute before the instance area
                         JVM also provide by default value to the static variable...   

     */

    static int x;
    static String name;
    static StaticVariable o = new StaticVariable();    // static object create  'o'

    /*
            we can access the static variable everywhere without any restriction
            we can access the static variable by the help of the class name, object name or directly,
            but it is recommended to use static variable with the help of the class name ...

     */

    {
        StaticVariable sv = new StaticVariable();
        System.out.println(name);                          // access directly inside the instance area
        System.out.println(StaticVariable.name);           // access with class name inside the instance area
        System.out.println(sv.name);                       // access with object inside the instance area
        System.out.println(new StaticVariable().name);     // access with the anonymous object inside the instance area
    }


    static
    {
        // by the help of the class name we can access like below
        System.out.println(StaticVariable.x);
        System.out.println(StaticVariable.name);

        // we can access directly like below
        System.out.println(x);
        System.out.println(name);


        // we can access through the static object 'o'
        System.out.println(o.name);
    }


    public static void main(String[] args)
    {
        // access by the help of the class name
        System.out.println(StaticVariable.x);
        StaticVariable.name = "Vishu Goyal";
        System.out.println(StaticVariable.name);

        // access by the help of the object
        StaticVariable obj = new StaticVariable();
        System.out.println(obj.name);


    }

}
