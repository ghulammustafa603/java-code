import java.util.Scanner;
public class task2
{
    public static void main( String args[])
    {
        System.out.println("Write your full name:");
        Scanner input=new Scanner(System.in);
        String fullName=input.nextLine();
        System.out.println("Initial letter are "+fullName.charAt(0));
        for(int i=0; i<fullName.length(); i++)
        {

            if(fullName.charAt(i)==' ')
            {
                System.out.println(fullName.charAt(i+1));
            }


        }

    }

}
