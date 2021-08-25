package exercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap_Practice {
    public static void main(String[] args){
        HashMap<String, Double> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter a student name:");
        do{
            System.out.print("Student: ");
            newStudent = input.nextLine();
            if(!newStudent.equals("")){
                System.out.print("Grade: ");
                Double newGrade = input.nextDouble();
                students.put(newStudent, newGrade);

                input.nextLine();
            }
        } while(!newStudent.equals(""));

        System.out.println("\nClass roster:");
        double sum = 0.0;
        for(Map.Entry<String, Double> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
            sum += student.getValue();
        }
        double avg= sum / students.size();
        System.out.println("Average grade: " + avg);
    }
}
