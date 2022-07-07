//Find the largest number among three using nested if..else statement
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a three numbers: ");
        int num1=reader.nextInt();
        int num2=reader.nextInt();
        int num3=reader.nextInt();
        if(num1>num2)
        {
            if(num1>num3){
                System.out.println("First num "+num1+" is Greatest Number among three.");
            }else{
            System.out.println("Third num "+num3+" is Greatest Number among three.");
            }
        }
            else {
                if(num2>num3){
                System.out.println("Second num "+num2+" is Greatest Number among three.");
        }
        else{
            System.out.println("Third num "+num3+" is Greatest Number among three.");
        }
        }
    }
}