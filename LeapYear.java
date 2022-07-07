//Java Program to Check a Leap Year
import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a year: ");
        boolean leap=false;
        int num1=reader.nextInt();
        if(num1%4==0)
        {
            if(num1%100==0)
            {
                if(num1%400==0)
                leap= true;
                else
                leap= false;
            }
            else{
                leap=true;
            }
        }
            else{
                leap=false;
            }
            if(leap){
                System.out.println(num1+" is leap year");
            }
                else{
                    System.out.println(num1+" is not a leap year");
                }
            }
    }
