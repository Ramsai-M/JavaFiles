//Reverse a String without any method.
import java.util.Scanner;
public class RevStrngWOM {
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a name: ");
        String revname=reader.nextLine();
        char[] ch=revname.toCharArray();
        String str="";
        for(int i=revname.length()-1;i>=0;i--){
            str+=ch[i];
        }
        System.out.println("Reverse of above string is: "+str);
        
    }
}
