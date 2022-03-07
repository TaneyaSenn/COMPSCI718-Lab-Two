package ictgradschool.industry.oop.truncateamount;

import ictgradschool.Keyboard;

/**
 * Write a program that prompts the user to enter an amount and a number of decimal places.  The program should then
 * truncate the amount to the user-specified number of decimal places using String methods.
 *
 * To truncate the amount to the user-specified number of decimal places, the String method indexOf() should be used
 * to find the position of the decimal point, and the method substring() should then be used to extract the amount to
 * the user-specified number of decimal places.  The program is to be written so that each task is in a separate method.
 * You need to write four methods, one method for each of the following tasks:
 *
 * 1. Printing the prompt and reading the amount from the user
 * 2. Printing the prompt and reading the number of decimal places from the user
 * 3. Truncating the amount to the user-specified number of DP's
 * 4. Printing the truncated amount
 *
 */
public class TruncateAmount {

    private void start() {

        // TODO Use other methods you create to implement this program's functionality.
        String amount = getAmountFromUser();
        int numDPs = readNumDPs();
        printTruncatedAmount(amount, numDPs);
    }

    // TODO Write a method which prompts the user and reads the amount to truncate from the Keyboard
    private String getAmountFromUser() {
        System.out.print("Please enter an amount: ");
        return Keyboard.readInput();
    }

    // TODO Write a method which prompts the user and reads the number of DP's from the Keyboard
    private int readNumDPs() {
        System.out.print("Please enter the number of decimal places: ");
        return Integer.parseInt(Keyboard.readInput());
    }

    // TODO Write a method which truncates the specified number to the specified number of DP's
    private String truncate(String amount, int numDPs) {
        int findDecimalIndex = amount.indexOf(".");
        return amount.substring(0, findDecimalIndex + 1 + numDPs);
    }

    // TODO Write a method which prints the truncated amount
    private void printTruncatedAmount(String amount, int numDPs) {
            System.out.println("Amount truncated to " + numDPs + " decimal places is: " + truncate(amount, numDPs));
    }

    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {
        TruncateAmount ex = new TruncateAmount();
        ex.start();
    }
}
