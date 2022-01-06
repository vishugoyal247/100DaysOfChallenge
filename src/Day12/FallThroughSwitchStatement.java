package Day12;

import java.util.Scanner;

public class FallThroughSwitchStatement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);


        //1. Fall through switch statement
        int x = sc.nextInt() ;
        switch (x)
        {
            case 0 :
                System.out.println("0");
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4 :
                System.out.println("4");
            default:
                System.out.println(" nothing ");
        }



        switch (x)
        {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("till 4 this is the only output will come.");
            case 5:
            case 6:
            case 7:
                System.out.println("from 5 to till 7 this will be the output come. ");
            case 8:
            default:
                System.out.println("nothing");
        }

        // we can only write default case once and default case will be execute in the last
        switch (x)
        {
            default -> System.out.println("default");
            case 0 -> System.out.println("0");
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
        }
    }

}

