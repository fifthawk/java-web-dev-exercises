package studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Counting_Characters {
    public static void main(String[] args) {
        String sentence = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with." +
                " So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero." +
                " Once you’ve done that, it’s pretty straightforward from there.";
        
        //char[] charactersInString = sentence.toCharArray(); --> for the orginal sentence to be checked.
        
        //Begin getting user input for sentence to check -->
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String userSentence = input.nextLine().toLowerCase();
        
        //Turn user input into char array with all lowercase letters -->
        char[] charactersInUserString = userSentence.toCharArray();
        
        //Initialize HashMap array for letters to be printed with numbers -->
        HashMap<Character, Integer> letters = new HashMap<>(); 
        
        
        for (Character i : charactersInUserString) {
            Character key = i;

            if (letters.containsKey(key)) {
                int count = letters.get(key);
                count++;
                letters.put(key, count);

            } else if (!letters.containsKey(key)) {
                letters.put(key, 1);
                continue;
            }

        }
        for (Map.Entry<Character, Integer> letter : letters.entrySet()) {
            System.out.println(letter.getKey() + ": " + letter.getValue());
        }
    }
 }



