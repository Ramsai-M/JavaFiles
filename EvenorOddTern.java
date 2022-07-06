//Check whether a number is even or odd using ternary operator
import java.util.Scanner;
public class EvenorOddTern{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=reader.nextInt();
        String Evenodd=(num%2==0)? "even": "odd";
        System.out.println("Entered Number "+num+" is "+Evenodd);
    }
}