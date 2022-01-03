package Day10;

public class ConditionalNewOperator
{
    public static void main(String[] args)
    {

        /*
        Conditional Operator (? :)
        - int x=(condition)?true:false;
        - nesting of operator is possible
        */
        int x = (5<6)?5:6;
        int y = (1>2)?3:((4>5)?6:7);
        System.out.println(x+" "+y);


        /*
        new operator
        - use new operator to create object
        - after creating object constructor will be executing to perform initialization of object
        - we have new but not delete , destructor of keyword is managed by garbage collector
        */
        ConditionalNewOperator can =new ConditionalNewOperator();
        System.out.println(can);


        /*
        [] operator
        - used to create and declare this array
        */
        int[] arr = new int[10];
        System.out.println(arr);

    }
}