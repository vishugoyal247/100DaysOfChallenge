package Day5;

public class AnonymousArray
{
    public static void main(String[] args)
    {

        /*
             Anonymous Array :  Those array which donot have their name
             sometime we can declare an array without name. The main purpose of this are jut for instant use only;

             syntax :  new int [ ] { 10, 20, 30};
         */


        System.out.println(sum( new int [] { 10, 20, 30 }));
    }
    public static int sum(int[] arr)
    {
        int total = 0;
        for (int ele : arr)
        {
            total += ele;
        }

        return total;
    }
}

