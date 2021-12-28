package Day2;
import java.lang.Math;


public class IntegralSigned {

    public static void main(String[] args) {

//        byte
        System.out.println("\n\n\nbyte operation ");
        byte w1 = 126;
        byte x1 = 127;
//      byte y1 = 128;  // CE:  required type : byte
//                              provide type : int
        byte y1 = (byte)128;
        byte z1 = (byte)129;
        byte a1 = (byte)-128;
        byte b1 = (byte)-129;
        byte c1 = (byte)-130;

        System.out.println("In Range +ve side           "+w1+"   "+x1);
        System.out.println("Out of Range in +ve side   "+y1+"  "+z1);
        System.out.println("In Range -ve side          "+a1);
        System.out.println("Out of range in  -ve side   "+b1+"   "+c1);
        System.out.println("\n\n\n\n\n\n");



        //Short
        System.out.println("short operation ");
        short w2 = 32766;
        short x2 = 32767;
//      short y2 = 32768;     // CE: required type : short
//                                   provide type : int
        short y2 = (short)32768;
        short z2 = (short)32769;
        short a2 = (short)-32768;
        short b2 = (short)-32769;
        short c2 = (short)-32770;

        System.out.println("In Range +ve side           "+w2+"   "+x2);
        System.out.println("Out of Range in +ve side   "+y2+"  "+z2);
        System.out.println("In Range -ve side          "+a2);
        System.out.println("Out of range in  -ve side   "+b2+"   "+c2);
        System.out.println("\n\n\n\n\n\n");



        //Int
        System.out.println("int operation ");
        int   w3 = 2147483646;
        int   x3 = 2147483647;
//      int   y3 = 2147483648;  // CE:  int value too large

        int   y3 = (int) 2147483648L;
        int   z3 = (int) 2147483648L;
        int   a3 = (int)-2147483648L;
        int   b3 = (int)-2147483649L;
        int   c3 = (int)-2147483650L;

        System.out.println("In Range +ve side           "+w3+"   "+x3);
        System.out.println("Out of Range in +ve side   "+y3+"  "+z3);
        System.out.println("In Range -ve side          "+a3);
        System.out.println("Out of range in  -ve side   "+b3+"   "+c3);
        System.out.println("\n\n\n\n\n\n");






//        //long
        System.out.println("long operation ");
        long   w4 = (( (long)Math.pow(2,64) )  );
        long  w5 =   (long)9_223_372_036_854_775_807L;
        System.out.println("In Range +ve side           "+w4);
        System.out.println("In Range +ve side           "+w5);



    }

}
