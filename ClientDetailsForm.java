//Take some details from Client like name,age,gender,mobile number, PPA using Java.
import java.util.Scanner;
public class ClientDetailsForm{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a Your Name: ");
        String name=reader.nextLine();
        System.out.println("Enter Your age: ");
        int age=reader.nextInt();
        System.out.println("Enter Your Gender: ");
        char gen=reader.next().charAt(0);
        System.out.println("Enter your Mobile number: ");
        long mobno=reader.nextLong();
        System.out.println("Enter the PPA: ");
        double ppa=reader.nextDouble();
		System.out.println("Client Name is: "+name+". His Age is "+age+" Years. His gender is "+gen+". \nClient Contact number is +91-"+mobno+". PPA is "+ppa+".");
    }
}
