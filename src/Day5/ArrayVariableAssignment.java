package Day5;

public class ArrayVariableAssignment
{
    public static void main(String[] args)
    {

        // when we assign a array to the other variabe then it is possible when only the same type or the parent-child relationship
        int[] x = {10, 20, 30};
        int[] y = x;
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        for (int ele : x )
        {
            System.out.print(ele + " ");

        }
        System.out.println("\n\n");

        // eg: for not a relationship between the two arrays
        int [] z = {10,20,30};
        char[] c = {'a','b','c'};
        //  z=c;    CE: required type: int[] array    but provided type is char[] array


        /*

        Convertable Types


        1st Array  ->  2nd Array
        char       ->  int      No
        int        ->  double   No
        float      ->  int      No
        String     ->  Object   Yes

        1st variable ->  2nd variable
        char         ->  int      Yes
        int          ->  double   Yes
        float        ->  int      No
        String       ->  Object   Yes

         */

        //  In case of Object type array child class array can be promoted to the parent class
        String[] s = {"a", "b", "c"};
        Object o = s;

        //  CE :  Not possible parent class to child class promotion
        //  Object[] s = {"a", "b", "c"};
        //  String o = s;           Error:   required String   &    provided  Object


        // Only referenced will change not copy the elements from one array to the other array
        // But must be same type of array then only this is possible
        int[] a = {10, 20, 30, 40};
        int[] b = {50, 60};
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        a = b;
        for (int ele : a )
        {
            System.out.print(ele + " ");

        }
        System.out.println();
        b = a;
        for (int ele : b )
        {
            System.out.print(ele + " ");

        }
        System.out.println("\n\n");



        /*
        Whenever we assign one array to the other
        -> Dimension should be matched
        -> size should be matched not required
         */

        int[][] ar = new int[3][];
        //ar[0] = new int[4][3];    CE: Dimension should be matched  required type -> int[],  provided type -> int[][]
        //ar[1] = 10;               CE: required type int[]  provided int
        ar[2] = new int[2];
    }
}

