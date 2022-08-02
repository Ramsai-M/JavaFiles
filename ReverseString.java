//Reverse a String in Java.
import java.util.Scanner;
class Main1{    
 public static String revstr(String str){    
  char ch[]=str.toCharArray();
  String rev="";
  for(int i=ch.length-1;i>=0;i--){
      rev+=ch[i];
  }
  return rev;
 }  
} 

public class ReverseString extends Main1{
    public static void main(String[] args){
        Main1 a=new Main1();
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a name: ");
        String revname=reader.nextLine();
        System.out.println("Reverse of above string is: "+a.revstr(revname));
        
    }
}