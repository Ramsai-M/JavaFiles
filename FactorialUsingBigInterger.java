//Find Factorial of a number using BigInteger
import java.util.Scanner;
import java.math.BigInteger;
public class FactorialUsingBigInterger{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter the Factorial number you want to calculate: ");
        int n=reader.nextInt();
        BigInteger factorial=BigInteger.ONE;
        for(int i=1;i<=n;i++){
            // factorial = factorial * i;
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("Factorial of %d  is %d: ",n,factorial);
    }
}