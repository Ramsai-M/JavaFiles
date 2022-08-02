//Find Factorial of a number using for loop
import java.util.Scanner;
public class FactorialForLoop{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter the Factorial number you want to calculate: ");
        int n=reader.nextInt();
        long factorial=1;
        for(int i=1;i<=n;i++){
            factorial *=i;
        }
        System.out.printf("Factorial of %d  is %d: ",n,factorial);
    }
}
