//Program to Add two numbers
import java.util.Scanner;
public class AddTwoNum{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first=reader.nextInt();
        System.out.println("Enter Second number: ");
        int second=reader.nextInt();
        System.out.println("Addition of "+first+" and "+second+" is: ");
        int sum=first+second;
        System.out.println(sum);
    }
}