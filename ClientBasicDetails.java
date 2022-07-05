//How to Print an Integer entered by an user?
import java.util.Scanner;
public class ClientBasicDetails{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter Your age: ");
        int age=reader.nextInt();
        System.out.println("Client age is: "+age+" years");
    }
}
