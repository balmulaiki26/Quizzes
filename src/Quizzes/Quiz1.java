package Quizzes;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class Quiz1 {


    //create a program which will
    // - take a specific number of student name from the console
    // - for each student, it should ask for 4 subjects name and marks for them all
    // - your code should get the avg marks & total for the each of the students
    // - store all the students name, marks, subjects in individual ArrayList/Hashset and print all subjects, students name from that

    //Tips : You may want to use Scanner, ArrayList, HashSet/ArrayList
    //Your code needs to by dynamic enough to handle as many numbers of student user may want to.
    //Think Smartly !

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    ArrayList studentList = new ArrayList();
    HashSet subjectList = new HashSet();

        System.out.println("how many student do you want to calculate");
        int count = scanner.nextInt();

        for(int i=0;i<count;i++){

            ArrayList marksList = new ArrayList();
            System.out.println("insert students name:");
            String student = scanner.next();


        }

    }
}

