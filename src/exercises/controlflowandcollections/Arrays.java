package exercises.controlflowandcollections;

public class Arrays {
    public static void main(String[] args) {
        int[] myArray = { 1, 1, 2, 3, 5, 8 };
        for (int i : myArray) {
            System.out.println(i);
        }
        for (int i : myArray) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        String phrase = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] splitString = phrase.split(" ");
        String[] secondSplitString = phrase.split("\\.");
        System.out.println(java.util.Arrays.toString(splitString));
        System.out.println(java.util.Arrays.toString(secondSplitString));
    }
}
