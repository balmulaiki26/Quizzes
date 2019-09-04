package Quizzes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

    public class Exam2 {

        //create a program which will
        // - take a specific number of family members name from the console. (has to be dynamic)
        // - take one specific name out of the list that user provided from console of whose secret santa to create
        // - your code should be able to create a secret santa for the choosen member of the family
        // - one can not be his own secret santa

        // if you want to take it to the next level, create the secret santa for all the family members in one go
        // one can not be secret santa for 2 people
        // one can not be secret santa for the same person for next 2 years


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            ArrayList<String> list = new ArrayList();
            HashSet santaList = new HashSet();
            System.out.println("how many poeple are in your family?");
            int count = scanner.nextInt();

            for(int i=0;i<count;i++) {
                System.out.println("insert the name of the people of the family:");
                list.add(scanner.next());
            }


            System.out.println("insert the name of whose secret santa to ");

            String secretSantaOf = scanner.next();

            list.remove(secretSantaOf);

            Random random = new Random();
            int index = random.nextInt(list.size());

            String secret = list.get(index);
            System.out.println(secretSantaOf+ " s secret santa is :" + secret);






            }

    }


