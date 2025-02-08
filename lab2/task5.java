import java.util.Scanner;
public class task5 {
    public static void main(String args [])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Write the value of a:");
        double a=input.nextDouble();
        System.out.println("Write the value of b:");
        double b=input.nextDouble();
        System.out.println("Write the value of c:");
        double c=input.nextDouble();
        double x1=-b+(Math.sqrt(Math.abs(b*b-(4*a*c))))/(2*a);
        System.out.println("The first value of x is="+x1);
        double x2=-b-(Math.sqrt(Math.abs(b*b-(4*a*c))))/(2*a);
        System.out.println("The second value of x is="+x2);
    }
}
