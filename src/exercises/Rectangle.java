package exercises;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Width of rectangle:");
        Double width = input.nextDouble();
        System.out.println("Height of rectangle:");
        Double height = input.nextDouble();
        System.out.println(width * height);
    }
}
