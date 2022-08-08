//Palindrome Program in Java
import java.util.Scanner;
public class Palndrme
{
	public static void main(String[] args) {
	    Scanner reader=new Scanner(System.in);
		System.out.println("Enter a palindrome number: ");
		long a=reader.nextLong();
		long temp=a;
		long r=0;
		long sum=0;
		while(a>0){
		   r=a%10;
		   sum=(sum*10)+r;
		   a=a/10;
		}
		if(temp==sum){
		    System.out.println(sum+" is a palindrome number.");
		}
		else{
		    System.out.println(sum+" is not a palindrome number.");
		}
	}
}
