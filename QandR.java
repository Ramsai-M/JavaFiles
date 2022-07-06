//Compute Quotient and Remainder
import java.util.Scanner;
public class QandR{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a divided number: ");
        int div=reader.nextInt();
        System.out.println("Enter the Divisor number: ");
        int divisor=reader.nextInt();
        double a=div/divisor;
        double b=div%divisor;
        System.out.println("Quotient is: "+a);
        System.out.println("Remainder is: "+b);
    }
}