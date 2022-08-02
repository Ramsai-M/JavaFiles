//Sum of Natural Numbers using while loop
import java.util.Scanner;
public class NaturalNumWhileLoop{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter the numbers upto you want to calculate: ");
        int n=reader.nextInt();
        int sum=0;
        int i=0;
        while(i<=n){
            sum +=i;
            i++;
        }
        System.out.println("Sum of all numbers are: "+sum);
    }
}
