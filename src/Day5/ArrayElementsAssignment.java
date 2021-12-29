package Day5;

public class ArrayElementsAssignment
{
    public static void main(String[] args)
    {

        //  case 1:  primitive type array
        int[ ] x = new int[5];
        x[0] = 10;
        x[1] = 'a';
        byte b = 20;
        x[2] = b;
        short s = 30;
        x[3] = s;
        for (int ele : x)
        {
            System.out.print(ele+"  ");
        }
        System.out.println("\n\n\n");


        //  case 2:  Object type array
        Object[] a = new Object[5];
        a[0]=new Object();
        a[1]=new String("Vishu");
        a[2]=new Integer(10);
        a[3]=new Float(10.50);
        a[4]=new Character('a');
        for (Object ele : a)
        {
            System.out.print(ele+"  ");
        }
        System.out.println("\n\n\n");


        //  case 3:  Abstract type array
        Number[ ] n = new Number[6];
        n[0] = new Byte((byte) 5);
        n[1] = new Short((short) 2);
        n[2] = new Integer(30);
        n[3] = new Long(22);
        n[4] = new Float(10.3F);
        n[5] = new Double(10.4);
        for (Number ele : n)
        {
            System.out.print(ele+"  ");
        }
        System.out.println("\n\n\n");


        // case 4:  interface type array
        Runnable[ ] r = new Runnable[5];
        r[0] = new Thread();
        //  r[1] = new String("Vishu");   It is not a child class of Runnable interface
        for (Runnable ele : r)
        {
            System.out.print(ele+"  ");
        }
        System.out.println("\n\n\n");


    }
}
