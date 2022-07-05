//Find ASCII value of a character
import java.util.Scanner;
public class ChartoInt{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter the Char value: ");
        char Alpha=reader.next().charAt(0);
        int ASCII=Alpha;// any of this ** int ASCII=(int)Alpha; **
        System.out.println(ASCII);
    }
}
