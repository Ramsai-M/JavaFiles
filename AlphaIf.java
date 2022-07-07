//Java Program to Check Alphabet using if else
import java.util.Scanner;
public class AlphaIf{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a char: ");
        char c=reader.next().charAt(0);
        if((c>='a' && c<='z') || (c>='A' && c<='Z')){
            System.out.println("Entered thing is a character");
        }
        else{
            System.out.println("Entered thing is not a character");
        }
    }
}