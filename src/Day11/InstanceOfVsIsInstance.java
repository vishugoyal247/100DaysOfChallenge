package Day11;

public class InstanceOfVsIsInstance
{
    public static void main(String[] args) throws ClassNotFoundException {
        /*
                Instanceof : we will use this operator to check whether the object is of particular type or not for the static creating object.

                isInstance() :  we will use this method to check whether the object is of particular type or not for the dynamic creating object.
         */



        Thread t = new Thread();



        // instanceof
        System.out.println(t instanceof Runnable);
        System.out.println(t instanceof Thread);

        //isInstance()
        System.out.println(Class.forName(args[0]).isInstance(t));


    }

}
