package Day11;

public class ClassNotFoundExceptionVsNoClassDefFoundError
{
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        /*
                No Class Def Found Error :
                                            when the class definition was not found at the runtime for static object
                                            the exception will raise ->  No Class Def Found Error

                Class Not Found Exception :
                                            when the class definition was not found at the runtime for static object
                                            the exception will raise ->  No Class Def Found Error
         */

        //No Class Def Found Error
//        Demo t = new Demo();           // definition was not provided...



        //Class Not Found Exception
        Object obj = Class.forName(args[0]).newInstance();
    }
}
