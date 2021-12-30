package Day6;

public class PrimitiveAndReferenceVariable
{
    /*
Based on type of value represented
- Primitive Variables
- Reference Variables
*/
    public static void main(String[] args)
    {
        //Primitive Variables
        System.out.println("Primitive Variables");
        int x = 10;
        float y = 25.6f;
        System.out.println(x);
        System.out.println(y);
        System.out.println();


        //Reference Variables {used to refer objects}
        System.out.println("Reference Variables");
        Object o1 = new Object();
        PrimitiveAndReferenceVariable p1 = new PrimitiveAndReferenceVariable();
        System.out.println(o1);
        System.out.println(p1);
        System.out.println();
    }


}
