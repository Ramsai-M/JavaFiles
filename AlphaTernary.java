//Java Program to Check Alphabet using ternary operator
import java.util.Scanner;
public class AlphaTernary{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a char: ");
        char c=reader.next().charAt(0);
        String answer=((c>='a' && c<='z') || (c>='A' && c<='Z'))? "Entered thing is a character": "Entered thing is not a character";
        System.out.println(answer);
    }
}