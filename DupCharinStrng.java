//How to find the duplicate characters in a string:
import java.util.Scanner;
import java.util.Arrays;
public class DupCharinStrng
{
public static void main(String[] args) {
   Scanner reader=new Scanner(System.in);
   System.out.println("Enter a word name");
   String wrd=reader.nextLine();
   char[] dch=wrd.toCharArray();
   for(int i=0;i<dch.length;i++){
       int count=1;
       for(int j=i+1;j<dch.length;j++){
           if(dch[i]==dch[j] && dch[i]!=' '){
              count++;
              dch[j]='0';
           }
       }
       if(count>1 && dch[i]!='0'){
           System.out.println(dch[i]);
       }
   }
}
}
