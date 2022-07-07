//Check if a Number is Positive or Negative using if else
import java.util.Scanner;
public class PosOrNeg{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a number: ");
        double pn=reader.nextDouble();
        if(pn>0){
            System.out.println(pn+" is Positive number.");
        }
        else if(pn<0){
            System.out.println(pn+" is negative number.");
        }
        else{
            System.out.println("Entered number is zero.");
        }
    }
}