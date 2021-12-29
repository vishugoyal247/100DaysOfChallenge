package Day4;

public class Array_Declare_create_intialize
{
    public static void main(String[] args)
    {
        /*
                Array is a collection of fixed no. of Homogenous data elements...

         */



        // Syntax for Array declaration for 1D
        int [ ]  x1;
        int x2  [ ];
        int   [ ]x3;



        // Syntax for Array declaration for 2D
        int [ ]    a1,    b1;
        int [ ]    a2[ ], b2;
        int [ ]    a3[ ], b3[ ];
        int [ ]    [ ]a4, b4;
        int [ ]    [ ]a5, b5[ ];
        //int [ ]    [ ]a6, [ ]b6;   // this type of declaration is not allowed  (unexpected identifier)





        //  Array fixed size declaration
        int [ ] x4 = new int[100];

        // size can not be assigned at the time of the declaration
        // int [6] x5 ;         // Compile time error
        int [ ] x6;

        // At the time of the creation the array we must declare the size of the array
        int [ ] x7 = new int[ 10 ];





        //2D - Array
            /*
                In java 2D array is not implemented by matrix style
                SUN people followed array of arrays of approach for multi-dimentional array
                The main advantage of memory approached utilization ( Zig-Zag array )
             */

        // 2D-Array-Declaration
        int[][] x = new int [2][];
        x[0] = new int[5];
        x[1] = new int[3];

        x[0][0] = 1;
        x[0][1] = 2;
        x[0][2] = 3;
        x[0][3] = 4;
        x[0][4] = 5;

        x[1][0] = 6;
        x[1][1] = 7;
        x[1][2] = 8;


        //Zig-Zag array traversing through for-each loop

        for(int[]  x11 : x)
        {
            for (int x12 : x11)
            {
                System.out.print(x12+"  ");
            }
            System.out.println();
        }


        System.out.println("\n\n\n");


        //Zig-Zag array traversing through for loop with length method

        for (int i=0; i<x.length; i++)
        {
            for (int j=0; j<x[i].length; j++)
            {
                System.out.print(x[i][j]+"  ");

            }
            System.out.println();
        }


        System.out.println("\n\n\n");


        // Array by default assigned by zero value

        int[ ] arr1 = new int[2];
        System.out.println(arr1);          // [I@3d075dc0
        System.out.println(arr1[0]);       // 0
        System.out.println(arr1[1]);       // 0

        System.out.println("\n\n\n");


        int[ ][ ] arr2 = new int[1][2];
        System.out.println(arr2);          //  [[I@214c265e
        System.out.println(arr2[0]);       //  [I@448139f0
        System.out.println(arr2[0][0]);     //  0
        System.out.println(arr2[0][1]);    //  0


        System.out.println("\n\n\n");



        int[ ][ ] arr3 = new int[1][];
        System.out.println(arr3);           // [[I@7cca494b
        System.out.println(arr3[0]);        // null

//        System.out.println(arr3[0][0]);    CE: NullPointerException
                                            // Cannot load from int array because "arr3[0]" is null


        //  Array declaration creation and initialization in a single line
        //  1D array
        int[ ] ar1 = {10, 20, 30, 40,50};

        // 2D array
        int[ ][ ] ar2 = {
                            {10, 20, 30, 40, 50},
                            {60, 70, 80, 90, 100}
                                                    };


        // Not valid expression
        // int[ ] y;
        // y = {10, 20, 30};    // CE: Illegal start of expression


    }
}
