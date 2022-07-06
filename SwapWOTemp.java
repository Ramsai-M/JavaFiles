//Swap two numbers without using temporary variable
import java.util.Scanner;
public class SwapWOTemp{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1=reader.nextInt();
        System.out.println("Enter the second number: ");
        int num2=reader.nextInt();
        num1=num1-num2;
        num2=num1+num2;
        num1=num2-num1;
        System.out.println("First number is: "+num1);
        System.out.println("Second number is: "+num2);
    }
}