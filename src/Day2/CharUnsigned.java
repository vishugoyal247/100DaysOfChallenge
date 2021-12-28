package Day2;

public class CharUnsigned {


    /*
    char
     */
    public static void main(String[] args)
    {


        char d = 32;                 //size--2bytes
        //  char e = 65537;            //compile time error(range 0 to 65535)
        char f = 65535;
        System.out.println(d);      // space ASCII code  
        System.out.println(f);
    }
}
