//Check Palindrome with string
import java.util.Scanner;
import java.util.Arrays;
public class PalndrmeWStrng
{
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a word to check it is palindrome or not.");
		String str=reader.nextLine();
		str=str.toLowerCase();
		char[] ch=str.toCharArray();
		String rev="";
		for(int i=0;i<ch.length;i++){
		    rev+=ch[i];
		}
		if(str.equals(rev)){
		    System.out.println(str+" is a palindrome word");
		}else{
		    System.out.println(str+" is not a palindrome word");
		}
	}
}