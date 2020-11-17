package studentDatabase;

import java.util.Scanner;

public class StudentDatabase {
    public static void main(String[] args) {
        // Ask how many students we want to add
        System.out.print("Enter the number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.print( students[n].toString() );
        }


        // Create n number of new students
    }
}
