package Day9;

import javax.print.attribute.standard.NumberOfInterveningJobs;

public class EqualityAndInstanceOf
{
    public static void main(String[] args)
    {
        /*
        Equality Operators(== , !=)
        - can apply anywhere object , boolean , int , etc.
        */

        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = t1;
        Thread t = new Thread();
        Object o = new Object();
        String s = new String("Etisha");
        System.out.println(t==o);                // false (relation b/w child and parent)
        System.out.println(o==s);                // false (relation b/w child and parent)
        //  System.out.println(s==t);                compile time error

        String s1 = new String("Etisha");
        String s2 = new String("Etisha");
        System.out.println(s1==s2);               // false
        System.out.println(s1.equals(s2));        // true
        System.out.println(s2==null);             // false
        System.out.println(null==null);           // true


        /*
        instanceof
        - To check the particular type of Object or variable
        - for any class interface (null instanceof X) ----> false always
        */

        Thread p1 = new Thread();
        System.out.println(p1 instanceof Thread);    // true
        System.out.println(p1 instanceof Object);    // true
        System.out.println(p1 instanceof Runnable);  // true
        //  System.out.println(p1 instanceof String);    compile time error( inconvertible type )

    }
}
