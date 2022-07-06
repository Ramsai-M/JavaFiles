//Check whether a number is even or odd using if...else statement
import java.util.Scanner;
public class EvenorOdd{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=reader.nextInt();
        if(num%2==0){
            System.out.println("Entered Number is even.");
        }
        else{
        System.out.println("Entered Number is Odd.");
        }
    }
}