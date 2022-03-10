package ictgradschool.industry.oop.letterscramble;

import ictgradschool.Keyboard;

public class LetterScramble {

    private void start() {

    String word = readAndReturnWord();

    String scrambledWord = rearrangeWord(word);

    String chosenLetter = readAndReturnLetter();

    printLetterPosition(scrambledWord, chosenLetter);

    printScrambledWord(scrambledWord);

    }


    // 1. Print prompt, read word from user and return it
    private String readAndReturnWord() {
        System.out.print("Enter a word: ");
        return Keyboard.readInput();
    }

    // 2. Randomly rearrange letters in word
    private String rearrangeWord(String word) {
        String lettersRemaining = word;
        String newWord = "";
        for (int i = 0; i< word.length(); i++) {
            int randomPosition = (int)(Math.random() *
                    lettersRemaining.length());
            newWord += lettersRemaining.charAt(randomPosition);
            lettersRemaining =
                    lettersRemaining.substring(0, randomPosition) +
                            lettersRemaining.substring(randomPosition + 1);
        }
        return newWord;
    }

    // 3. Print prompt, read chosen letter from user and return letter
    private String readAndReturnLetter() {
        System.out.print("Choose a letter: ");
        String letter = Keyboard.readInput();
        return letter;
    }

    // 4. Print position of the chosen letter in scrambled word
    private void printLetterPosition(String scrambledWord, String chosenLetter) {
        int letterIndex = scrambledWord.indexOf(chosenLetter);
        System.out.println("This letter is now in position " + letterIndex + "!");
    }

    // 5. Print scrambled word
    private void printScrambledWord(String scrambledWord) {
        System.out.println("The scrambled word is " + scrambledWord);
    }

    public static void main(String[] args) {
        LetterScramble example = new LetterScramble();
        example.start();
    }

}
