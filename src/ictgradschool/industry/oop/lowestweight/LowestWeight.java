package ictgradschool.industry.oop.lowestweight;

import ictgradschool.Keyboard;

/**
 * Write a program which asks the user to enter the weights of two people,
 * then uses Math.min() to determine the lowest weight, and prints out the result.
 */
public class LowestWeight {

    /**
     * TODO Your code here. You may also write additional methods if you like.
     */
    private void start() {
        System.out.print("What is the first person's weight (kg)?");
        double firstWeightDouble = Double.parseDouble(Keyboard.readInput());
        System.out.println("The first person's weight is " + firstWeightDouble + "kg.");

        System.out.print("What is the second person's weight (kg)?");
        double secondWeightDouble = Double.parseDouble(Keyboard.readInput());
        System.out.println("The second person's weight is " + secondWeightDouble + "kg.");

        double lowestWeight = Math.min(firstWeightDouble, secondWeightDouble);
        System.out.println("The lowest weight is " + lowestWeight + "kg.");
    }

    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {

        LowestWeight ex = new LowestWeight();
        ex.start();

    }
}
