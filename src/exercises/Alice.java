package exercises;
import java.util.Scanner;


public class Alice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String paragraph = "\n"  +
                "    Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it, 'and what is the use of a book,'" +
                " thought Alice 'without pictures or conversation?'\n";
        String lowerP = paragraph.toLowerCase();
        System.out.println("Enter a word and check if it's in Alice: ");
        String word = input.nextLine();
        boolean checkedWord = lowerP.contains(word.toLowerCase());
        if(checkedWord){
            System.out.println(lowerP.indexOf(word));
            System.out.println(word.length());
        }



    }
}
