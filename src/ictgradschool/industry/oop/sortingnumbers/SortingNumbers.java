package ictgradschool.industry.oop.sortingnumbers;

import ictgradschool.Keyboard;

/**
 * Write a program that prompts the user to enter a range – 2 integers representing a lower bound and an upper bound.
 * You should use Keyboard.readInput() for this. Then, convert these bounds from String to int using Integer.parseInt().
 * Your program should then use Math.random() to generate 3 random integers that lie between the range entered (inclusive),
 * and then use Math.min() to determine which of the random integers is the smallest.
 */
public class SortingNumbers {

    /**
     * TODO Your code here. You may also write additional methods if you like.
     */
    private void start() {
        System.out.print("Lower bound? ");
        int lower = Integer.parseInt(Keyboard.readInput());
        System.out.print("Upper bound? ");
        int upper = Integer.parseInt(Keyboard.readInput());

        int randomNum1 = (int)Math.floor(Math.random()*(upper-lower+1)+lower);
        int randomNum2 = (int)Math.floor(Math.random()*(upper-lower+1)+lower);
        int randomNum3 = (int)Math.floor(Math.random()*(upper-lower+1)+lower);

        System.out.println("Your 3 randomly generated numbers are " + randomNum1 + ", " + randomNum2 + " and " +  randomNum3 + ".");

        int smallestNum = Math.min(Math.min(randomNum1, randomNum2), randomNum3);
        System.out.println("The smallest number is " + smallestNum + ".");
    }

    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {

        SortingNumbers ex = new SortingNumbers();
        ex.start();

    }
}
