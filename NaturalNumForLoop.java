//Sum of Natural Numbers using for loop
import java.util.Scanner;
public class NaturalNumForLoop{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter the numbers upto you want to calculate: ");
        int n=reader.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum +=i;
        }
        System.out.println("Sum of all numbers are: "+sum);
    }
}