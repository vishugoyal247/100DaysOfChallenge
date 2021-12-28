package Day3;

public class BooleanAndCharLiterals
{

    public static void main(String[] args)
    {
          // boolean
          boolean a = true;
//        boolean b = 0;                             // CE: provided int
//        boolean c = True;                          // CE: can not resolve symbol
//        boolean d = "true";                        // CE: provided String
//        boolean e ="True";                         // CE: provided String





        // char
        char ch1 = 'a';
//      char ch2 = b;                                 // CE: can't not resolve a symbol
//      char ch3 = "a";                               // CE: provided String
//      char ch4 = 'ab';                              //too many characters in character literals
        char ch5 = 97;                                // type conversion is done by implicit

          char ch6 = 65 | 66 | 67;
          char ch7 = 077;
          char ch8 = 0x77;

          char ch9 = '\u0061';
//        char ch10 = '\U0061';                         illegal escape character
//        char ch11 = '\u08938332';                     too many character is assign

          char ch12 = '\n';
          char ch13 = '\t';                             //( '\n', '\t', '\r', '\b', '\f', '\'', '\', '\\' )

          char ch14 = 65535;
//        char ch15 = 0xBeer;                           out of range of hexal form
//        char ch16 = \uface;                           can not resolve symbol and expression unexpected
          char ch17 = '\ubeef';
//        char ch18 = '\m';                             illegal escape character is not valid
//        char ch19 = '\iface';                         illegal escape character is not valid
//        char ch20 = '65536';                          too many character assign  to a character out of range character range

        System.out.println(ch1);
        System.out.println(ch5);
        System.out.println(ch6);
        System.out.println(ch7);
        System.out.println(ch8);
        System.out.println(ch9);
        System.out.println(ch12);
        System.out.println(ch13);
        System.out.println(ch14);
        System.out.println(ch17);

    }
}
