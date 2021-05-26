package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
        HouseCat newCat = new HouseCat("Rufus", 12);
        newCat.sleep();
        newCat.eat();
        System.out.println(newCat.getFamily());
    }
}
