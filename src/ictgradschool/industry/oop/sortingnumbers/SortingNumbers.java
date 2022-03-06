package ictgradschool.industry.oop.sortingnumbers;

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
        int rangeMin = 25;
        int rangeMax = 30;
        int getRandomNumber1 = (int)Math.floor(Math.random()*(rangeMax-rangeMin+1)+rangeMin);
        int getRandomNumber2 = (int)Math.floor(Math.random()*(rangeMax-rangeMin+1)+rangeMin);
        int randomMin = Math.min(getRandomNumber1, getRandomNumber2);
        int randomMax = Math.max(getRandomNumber1, getRandomNumber2);
        System.out.println("Your lucky numbers are " + randomMax + " and " + randomMin);
    }
    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {

        SortingNumbers ex = new SortingNumbers();
        ex.start();

    }
}
