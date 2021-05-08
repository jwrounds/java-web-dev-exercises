package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        int width;
        int length;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Give the rectangle's width:");
        width = input.nextInt();
        System.out.println("Give the rectangle's length:");
        length = input.nextInt();
        input.close();

        System.out.println("Rectangle's area is " + (length * width));
    }
}
