package Day8;

public class JavaCodingStandard
{

    /*
           RULES FOR JAVA CODING STANDARD

            -- > Interface are Adjective starts with upperCase. If it has multiple words so every word start with upper case
            -- > Method are verb + noun should start with lower case and midName starts with capital
            -- > Variable are nouns starts with lowercase and midName are Capital.
            -- > Constant are just a value and all the name is capital and _

     */



    public static void main(String[] args)
    {
            // Through getter and setter
            StudentBean obj1 = new StudentBean();
            obj1.setRollNo(1);
            obj1.setName("vishu");
            System.out.print(obj1.getRollNo()+"  ");
            System.out.println(obj1.getName());

            // Through constructor and getter
            StudentBean obj2 = new StudentBean(2,"Arnav");
            System.out.print(obj2.getRollNo()+"  ");
            System.out.println(obj2.getName());

            // Through constructor and constructor will call the getter method
            StudentBean obj3 = new StudentBean("Etisha",3);

    }
}


class StudentBean
{




    private int rollNo;
    private String name;

//     Constructor which helps us to initialize the value of the variable
//    Constructor overloading
    StudentBean(int rollNo, String name)
    {
        this.rollNo = rollNo;
        this.name = name;

    }
    StudentBean(String name,int rollNo )
    {
        this.rollNo = rollNo;
        this.name = name;
        System.out.println(getRollNo() +"  "+ getName());

    }
    StudentBean()
    {

    }


    // Setter which helps us to set the private variable
    public void setRollNo(int rollNo)
    {
        this.rollNo = rollNo;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    // Getter which helps us to access the private variable through these methods
    public int getRollNo()
    {
        return rollNo;
    }
    public String getName()
    {
        return name;
    }
}