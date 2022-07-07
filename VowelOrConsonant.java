//Check whether an alphabet is vowel or consonant using if..else statement
import java.util.Scanner;
public class VowelOrConsonant{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a Char: ");
        char ch=reader.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
        System.out.println("Entered character is Vowel");
        }
        else{
            System.out.println("Entered character is consonant");
        }
    }
}