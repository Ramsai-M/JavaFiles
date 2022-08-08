//Reverse a String using StringBuilder.
import java.util.Scanner;
class Main1{    
 public static String revstr(String str){    
  StringBuilder sb=new StringBuilder(str);
  sb.reverse();
  return sb.toString();
 }  
} 

public class RevStrngBuild extends Main1{
    public static void main(String[] args){
        Main1 a=new Main1();
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a name: ");
        String revname=reader.nextLine();
        System.out.println("Reverse of above string is: "+a.revstr(revname));
        
    }
}
