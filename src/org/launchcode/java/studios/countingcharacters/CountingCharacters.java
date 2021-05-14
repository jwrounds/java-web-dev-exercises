package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        String userStr;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word or phrase or ENTER to use default: ");
        userStr = input.nextLine();
        
        if (!userStr.equals("")) {
            str = userStr;
        }

        input.close();

        char[] charArray = str.toLowerCase().toCharArray();
        HashMap<Character, Integer> charCounts = new HashMap<>();

        for (char c : charArray) {
            if (Character.isLetter(c)) {
                if (charCounts.containsKey(c)) {
                    int currentVal = charCounts.get(c);
                    charCounts.put(c, currentVal + 1);
                } else {
                    charCounts.put(c, 1);
                }
            }

        }

        for (Map.Entry<Character, Integer> c : charCounts.entrySet()) {
            System.out.println(c.getKey() + ": " + c.getValue());
        }
    }
}
