//Generate Multiplication Table using for loop
import java.util.Scanner;
public class MultiplicationForLoop{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter the numbers upto you want to calculate: ");
        int n=reader.nextInt();
        System.out.println("Enter the number which you want the table:");
        int k=reader.nextInt();
        int i=1;
        long a=1;
        for(i=1;i<=n;i++){
            a=k*i;
            System.out.printf("\n Multiplication of %d * %d is %d",k,i,a);
        }
    }
}
