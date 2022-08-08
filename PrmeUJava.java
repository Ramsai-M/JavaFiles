//Prime Number Program in Java
import java.util.Scanner;
public class PrmeUJava{
public static void main(String[] args){
Scanner reader=new Scanner(System.in);
System.out.println("Enter a value to check the prime number or not: ");
long a=reader.nextLong();
long m;
int flag=0;
m=a/2;
if(a==0 || a==1){
    System.out.println(a+" is not a prime number");
}else{
    for(int i=2;i<=m;i++){
        if(a%i==0){
            System.out.println(a+" is not a prime number");
            flag=1;
            break;
        } 
    }
    if(flag==0){
        System.out.println(a+" is a prime number");
    }
}
}
}
