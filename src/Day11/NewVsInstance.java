package Day11;

class Test
{
    public void m1()
    {
        System.out.println("Method in Test class");
    }
}


public class NewVsInstance
{
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        /*
            we can create an object through new keyword but in some case we can't use new for creating an object
            but if we can't know the class name before we use dynamic class name when we compile the then
            we will provide class name at the command line args

            In the case of new operator based on our req. we can call any constructor
            but new instance method internally call no args. constructor,
            Hence, to use newInstance() method compulsory corresponding class should contain no arg. constructor otherwise
            we will get runtime exception saying InstantiationException

         */



        // new operator use for static create an  object...
        Test t = new Test();
        t.m1();

        // newInstance() use for dynamically creation of object...
        Object o = Class.forName(args[0]).newInstance();
        //Object o = Class.forName(args[0]);                   // Also use like this
        System.out.println(("Object created for"+o.getClass().getName()));

    }
}
