//Find Factorial of a number using while loop
import java.util.Scanner;
public class FactorialUsingWhileLoop{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter the Factorial number you want to calculate: ");
        int n=reader.nextInt();
        int i=1;
        long factorial=1;
        while(i<=n){
            // factorial = factorial * i;
            factorial *=i;
            i++;
        }
        System.out.printf("Factorial of %d  is %d: ",n,factorial);
    }
}
