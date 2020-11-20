import java.util.Scanner;

public class Palindrome {

    public static void main(String args[]) {
        String inputWord, palindromeWord = "";
        Scanner in = new Scanner(System.in);
        int wordlength = 0, alphabetcount = 0, digitcount = 0, spcharcount = 0;
        System.out.println("Enter a word");
        inputWord = in.nextLine();
        wordlength = inputWord.length();

        if (wordlength > 0 & wordlength <= 20) {

            //count the alphabets, digits and special characters in the input word
            for (int i = 0; i < wordlength; i++) {
                if (Character.isLetter(inputWord.charAt(i))) {
                    alphabetcount++;
                } else if (Character.isDigit(inputWord.charAt(i))) {
                    digitcount++;
                } else {
                    spcharcount++;
                }
            }

                //display count of alphabets, digits and special characters
                System.out.println("Total alphabets are :" + alphabetcount);
                System.out.println("Total digits are :" + digitcount);
                System.out.println("Total special characters are :" + spcharcount);

            //Validate input word is palindrome or not
            for (int i = wordlength - 1; i >= 0; i--) {
                palindromeWord = palindromeWord + inputWord.charAt(i);
            }
            if (inputWord.equals(palindromeWord)) {
                System.out.println("Entered word is a palindrome " + inputWord + " and the palindrome of the word is " + palindromeWord);
            } else {
                System.out.println("Entered word isn't a palindrome " + inputWord);
            }
        } else {
            System.out.println("The length of entered word is " + wordlength);
            System.out.println("ERROR : The word length should be greater than 0 and less than 20");
        }
    }

}
