package ictgradschool.industry.oop.noughtsandcrosses;

/**
 * Write a program to extract 3 rows of 6 characters from a String of 18 characters.
 * The program should print out the 3 rows, followed by the left diagonal of the 3 rows.
 * The String method substring() can be used to extract the required characters.
 */
public class NoughtsAndCrosses {
    /**
     * Runs an example output.
     */
    private void start() {
        String letters = "X X O O X O X O X ";

        String row1 = getRow(letters, 1);

        String row2 = getRow(letters, 2);

        String row3 = getRow(letters, 3);

        printRows(row1, row2, row3);

        String leftDiagonal = getLeftDiagonal(row1, row2, row3);

        printDiagonal(leftDiagonal);
    }

    /**
     * TODO Implement this
     */
    public String getRow(String letters, int row) {
        int length = 6;
        int start = (row-1) * length ;
        int end = row * length;
        return letters.substring(start, end);
    }

    /**
     * TODO Implement this
     */
    public void printRows(String row1, String row2, String row3) {
        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
    }

    /**
     * TODO Implement this
     */
    public String getLeftDiagonal(String row1, String row2, String row3) {
        return row1.charAt(0) + " " + row2.charAt(2) + " " + row3.charAt(4);
    }

    /**
     * TODO Implement this
     */
    public void printDiagonal(String leftDiagonal) {
        System.out.print("Diagonal: " + leftDiagonal);
    }

    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {
        NoughtsAndCrosses ex = new NoughtsAndCrosses();
        ex.start();
    }
}
