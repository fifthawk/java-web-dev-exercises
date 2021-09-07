package org.launchcode.java.demos.lsn3classes1;
import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
       Student firstStudent = new Student("Jack", 333, 1, 4.0);
       Teacher firstTeacher = new Teacher("","","",0);


       firstTeacher.setFirstName("Blake");
        firstTeacher.setLastName("Henderson");
        firstTeacher.setSubject("Cooking");
        firstTeacher.setYearsTeaching(12);
        System.out.println(firstTeacher.firstName);
        System.out.println(firstTeacher.lastName);
        System.out.println(firstTeacher.subject);
        System.out.println(firstTeacher.yearsTeaching);

    }
    public class Course {
        private String topic;
        private Teacher instructor;
        private ArrayList<Student> enrolledStudents;
    }

    public static class Teacher {
        private String firstName;
        private String lastName;
        private String subject;
        private int yearsTeaching;

        public Teacher(String firstName, String lastName,
                       String subject, int yearsTeaching) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.subject = subject;
            this.yearsTeaching = yearsTeaching;
        }

        public Teacher(String firstName, String lastName, String subject) {
            this(firstName, lastName, subject, 0);
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getSubject() {
            return subject;
        }

        public int getYearsTeaching() {
            return yearsTeaching;
        }

        public void setFirstName(String firstName){
            this.firstName = firstName;
        }

        public void setLastName(String lastName){
            this.lastName = lastName;
        }

        public void setSubject(String subject){
            this.subject = subject;
        }

        public void setYearsTeaching(int yearsTeaching){
            this.yearsTeaching = yearsTeaching;
        }
    }
}


