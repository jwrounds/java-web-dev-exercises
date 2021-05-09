package exercises.controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String studentName;
        int id;

        do {
            System.out.println("Please enter student name: ");
            studentName = input.nextLine();

            if (!studentName.equals("")) {
                System.out.println("Please enter student id: ");
                id = input.nextInt();
                students.put(id, studentName);

                input.nextLine();
            }

        } while (!studentName.equals(""));

        input.close();

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("StudentID: " + student.getKey() + ", Student Name: " + student.getValue());
        }

    }
}
