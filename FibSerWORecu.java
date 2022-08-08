//Fibonacci Series in Java without using recursion
import java.util.Scanner;
public class FibSerWORecu{
public static void main(String[] args){
Scanner reader=new Scanner(System.in);
System.out.println("Enter the starting value: ");
long a=reader.nextLong();
System.out.println("Enter the second starting value: ");
long b=reader.nextLong();
long sum=0;
int i=0;
System.out.println("Enter the number upto where you want the fibonacci series: ");
int n=reader.nextInt();
for(i=0;i<=n;i++){
sum=a+b;
a=b;
b=sum;
System.out.print(sum+" ");
}
}
}