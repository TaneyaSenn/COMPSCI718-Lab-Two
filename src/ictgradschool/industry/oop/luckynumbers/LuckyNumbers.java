package ictgradschool.industry.oop.luckynumbers;

/**
 * Write a program which generates 2 random integers between 25 and 30 (inclusive),
 * then uses Math.min() and Math.max() to display them in descending sequence.
 */
public class LuckyNumbers {
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

        LuckyNumbers ex = new LuckyNumbers();
        ex.start();

    }
}
