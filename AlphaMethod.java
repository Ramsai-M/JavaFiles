//Java Program to Check Alphabet using isAlphabetic() Method
import java.util.Scanner;
public class AlphaMethod{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a char: ");
        char c=reader.next().charAt(0);
        if(Character.isAlphabetic(c)){
            System.out.println("Entered thing is a Character");
        }
        else{
            System.out.println("Entered thing is not a Character");
        }
    }
}