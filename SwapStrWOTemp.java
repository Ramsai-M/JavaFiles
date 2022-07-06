//Swap two strings without using the temp variable.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner reader=new Scanner(System.in);
		System.out.println("Enter a first string: ");
		String a=reader.nextLine();
		System.out.println("Enter a second String: ");
		String b=reader.nextLine();
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("First String is: "+a+" \nSecond String is: "+b);
	}
}