package exercises;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Practice {
    public static void main(String[] args){
        ArrayList<String> words = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        words.add("this");
        words.add("potato");
        words.add("tomato");
        words.add("bagel");
        words.add("ginger");
        words.add("wings");
        System.out.println("Enter a word length to search for: ");
        Double tester = input.nextDouble();
        for(String i : words){
            if(i.length() == tester){
                System.out.println(i + " matches.");
                continue;
            } System.out.print(i + " doesn't match.. it's " + i.length() + " letters long. ");
        }


    }
}
