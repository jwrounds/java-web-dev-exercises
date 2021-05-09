package exercises.controlflowandcollections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        ArrayList<String> wordList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int wordLength;

        myList.add(204);
        myList.add(23);
        myList.add(76);
        myList.add(982);
        myList.add(45);
        myList.add(986);
        myList.add(93);
        myList.add(36);
        myList.add(67);
        myList.add(69);

        Integer sum = 0;
        for (Integer i : myList) {
            sum += i;
        }
        System.out.println(sum);


        wordList.add("dog");
        wordList.add("vodka");
        wordList.add("baseball");
        wordList.add("kitchen");
        wordList.add("walk");
        wordList.add("bear");
        wordList.add("apple");


        System.out.println("Return words of what length or greater: ");
        wordLength = input.nextInt();

        for (String item : wordList) {
            if (item.length() >= wordLength) {
                System.out.println(item);
            }
        }
        input.close();
    }
}
