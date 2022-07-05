//Multiply Two Floating-Point Numbers in java?
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter first float value: ");
        float f1=reader.nextFloat();
        System.out.println("Enter Second float value: ");
        float f2=reader.nextFloat();
        System.out.println("Multiplication of "+f1+" and "+f2+" is: ");
        double f=f1*f2;
        System.out.println(f);
    }
}
