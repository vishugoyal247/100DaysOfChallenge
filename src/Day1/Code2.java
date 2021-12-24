package Day1;


// Rules for identifiers
//
//[ a - z ]
//[ A - Z ]
//[ 0 - 9 ]
//[ $ ]
//[ _ with any alphabet or number ]

public class Code2
{
    public static void main(String[] args)
    {


        int a = 10;
        int _$ = 20;
//      int _ = 4;       // compile time error [ identifier not a single underscore ]
        int $ = 3;
        int j = 44;
//      int 74 = 3;      // compile time error [ identifier should not start with digits ]
        int Interger = 5;
//      int int = 5;     // identifiers should not a pre-defined data types
        String String = "hello";  // identifiers should be class
        String Runnable = "Bye";  // identifiers should be interface

        int gguguyghjvbhjgyvyu67t678578tyuvguf67r7et7tyuioytryyuuiyytdcvbghdyoytrytyuhjggcfytuoiyu8t7rtyyutifgcyt = 8;
//      identifiers are case sensitive and non length.

        System.out.println(a);
        System.out.println(_$);
        System.out.println($);
        System.out.println(j);
        System.out.println(Interger);
        System.out.println(String);
        System.out.println(Runnable);
        System.out.println(gguguyghjvbhjgyvyu67t678578tyuvguf67r7et7tyuioytryyuuiyytdcvbghdyoytrytyuhjggcfytuoiyu8t7rtyyutifgcyt);


    }
}
