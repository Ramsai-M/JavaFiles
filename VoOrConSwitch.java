//Check whether an alphabet is vowel or consonant using switch statement
import java.util.Scanner;
public class VoOrConSwitch{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a Char: ");
        char ch=reader.next().charAt(0);
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Entered character is vowel");
                break;
            default :
            System.out.println("Entered character is consonant");
        }
    }
}