package javaprograms;

import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String roman = scanner.nextLine().toUpperCase();
        scanner.close();

        int result = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char currentChar = roman.charAt(i);
            int currentValue = 0;

            switch (currentChar) {
                case 'I':
                    currentValue = 1;
                    break;
                case 'V':
                    currentValue = 5;
                    break;
                case 'X':
                    currentValue = 10;
                    break;
                case 'L':
                    currentValue = 50;
                    break;
                case 'C':
                    currentValue = 100;
                    break;
                case 'D':
                    currentValue = 500;
                    break;
                case 'M':
                    currentValue = 1000;
                    break;
            }

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        System.out.println("Integer value: " + result);


	}

}
