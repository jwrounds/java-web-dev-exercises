package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String firstLine;
        String modifiedLine;
        String searchTerm;
        Scanner input;
        boolean found;

        input = new Scanner(System.in);

        firstLine = "alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought alice 'without pictures or conversation?'";

        System.out.println("Search term:");
        searchTerm = input.nextLine();
        found = firstLine.contains(searchTerm.toLowerCase());
        input.close();

        if (found) {
            int termIndex;
            int termLength;

            termIndex = firstLine.indexOf(searchTerm);
            termLength = searchTerm.length();

            System.out.println("Search term found.\nIndex: " + termIndex + "\nLength: " + termLength);
            modifiedLine = firstLine.substring(0, termIndex) + firstLine.substring((termIndex + termLength), (firstLine.length() - 1));
            System.out.println(modifiedLine);
        }
    }
}
