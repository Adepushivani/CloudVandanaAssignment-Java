package javaprograms;

import java.util.Scanner;

public class PangramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase();
        scanner.close();

        boolean[] alphabetCheck = new boolean[26];
        int totalLetters = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                int index = ch - 'a';
                if (!alphabetCheck[index]) {
                    alphabetCheck[index] = true;
                    totalLetters++;
                }
            }
        }
        if (totalLetters == 26) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
   
	}

}
