package Day3;

public class StringAndBinaryLiterals
{
    public static void main(String[] args)
    {
        // String Lateral
        String s1 = "hello";
        String s2 = "by";
        System.out.println(s1+"   "+s2);

        // Binary Lateral (this concept will come 1.7 version onwards)
        int x = 0B111;
        int y = 0b011;
        System.out.println(x+"  "+y);

        // Extras  ( '_' )  ( this concept will come 1.7 version onwards)
        double d1 = 1234.5678;
        double d2 = 1_234.5_6_7_8;
//        double d3 = 1_234.5_6_7_8_;                      // for easy readibility of code
//        double d4 = _1_234.5_6_7_8;
//        double d5 = 1_234_.5_6_7_8;              /* underscore will come between the digits only not in starting
//        double d6 = 1_234._5_6_7_8;                 or not in the end or not in before or after the decimal  */

          System.out.println(d1+"  "+d2);
    }
}
