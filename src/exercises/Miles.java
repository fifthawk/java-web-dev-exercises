package exercises;
import java.util.Scanner;


public class Miles {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Number of miles driven: ");
        Double miles = input.nextDouble();
        System.out.println("How many gallons used: ");
        Double mpg = input.nextDouble();
        System.out.println(miles/mpg + "mpg");
    }
}
