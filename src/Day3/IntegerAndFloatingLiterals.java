package Day3;

public class IntegerAndFloatingLiterals
{

    public static void main(String[] args)
    {
        // A const. value assigned to a variable is called Literal.

        // int type
        int x1 = 10;  //(decimal form)
        int y1 = 010; //(octal form)
        int z1 = 0x10;//(hexal form)
        System.out.println("Int data type");
        System.out.println("decimal form = "+x1);
        System.out.println("octal form = "+y1);
        System.out.println("hexal form = "+z1);
        System.out.println("\n\n\n");


        // long type
        long x2 = 10L;  //(decimal form)
        long y2 = 010L; //(octal form)
        long z2 = 0x10L;//(hexal form)  // Java is not a case sensitive in case of the hexa decimal form
        System.out.println("Long data type");
        System.out.println("decimal form = "+x2);
        System.out.println("octal form = "+y2);
        System.out.println("hexal form = "+z2);
        System.out.println("\n\n\n");


        // float type
        float x3 = 10f;  //(decimal form)
        float y3 = 010.37f; //(integer form)  // in float octal form is consider as a decimal form
        //float z33 = 0x10.54;   // in hexal form have not consider a decimal in between the value
        float z3 = 0x10f;//(integer literal can be assigned to float variable)
        System.out.println("float data type");
        System.out.println("decimal form = "+x3);
        System.out.println("octal form = "+y3);
        System.out.println("hexal form = "+z3);
        System.out.println("\n\n\n");



        // double type
        double x4 = 10;  //(decimal form)
        double y4 = 010; //(octal form)
        double z4 = 0x10;//(hexal form)  // Java is not a case sensitive in case of the hexa decimal form

        System.out.println("double data type");
        System.out.println("decimal form = "+x4);
        System.out.println("octal form = "+y4);
        System.out.println("hexal form = "+z4);
        System.out.println("\n\n\n");



        // Floating Literals
        //  float a = 123.456;              compile time error(by default double)
        float a1 = 123.456F;            //explicit type conversion
        double b1 = 123.456;
        //  float b = 123.456d;             //compile time error
        double b2 = 0123.456;           //not octal , it is decimal only
        //  double b3 = 0x123.456;          //compile time error(hexadecimal form not applicable to floating point literals)
        //  double b4 = 0786 ;              //compile time error(integer literal so integer value too large)
        double b5 = 0xface;
        double b6 = 1.2e3;
        float b7 = 1.23e3f;
        //  float b = 1.23e33;             //compile time error(by default it is consider as double )
        float a11 =10;                       //by default it is  consider as integer literal then type conversion
        float b =10f;                       //it is a integer literal type cast to float literal
        float a2 = 0xff;                     //integer literal in hexa form directly assigned to float
        float as = 0767f;                    //integer literal to float literal
        float as1 = 0767;                    // integer literal in octal form assign to float after convert to decimal
        float as2 = 0x45f;                   // integer literal in hexa form assign to float
        float as3 = 0x45;                    // integer literal in hexa form assign to float
        System.out.println(a11);
        System.out.println(b);
        System.out.println(a2);
        System.out.println(as);
        System.out.println(as1);
        System.out.println(as2);
        System.out.println(as3);


    }
}
