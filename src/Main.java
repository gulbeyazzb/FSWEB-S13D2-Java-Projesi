import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-25));
        System.out.println("---------------------------------------");
        System.out.println(isPerfectNumber(-1));
        System.out.println("---------------------------------------");
        System.out.println(numberToWords(2340));
    }

    public static boolean isPalindrome(int num) {
        int reversedNumber = 0;
        int numberToReverse = Math.abs(num);
        while (numberToReverse > 0) {
            int mod = numberToReverse % 10;
            reversedNumber = reversedNumber * 10 + mod;
            numberToReverse /= 10;
        }
        if (reversedNumber == Math.abs(num)) {
            System.out.println(num + " is a palindrome number");
        } else {
            System.out.println(num + " is not a palindrome number");
        }
        return reversedNumber == Math.abs(num);

    }

    public static boolean isPerfectNumber(int num) {
        if (num < 0) return false;
        int divs = 0;
        for (int i = 1; i < num/2; i++) {
            if (num % i == 0) {
                divs += i;
            }
        }
        System.out.println(divs);
        return divs == num;
    }

    public static String numberToWords(int num) {
        if (num < 0) return "invalid Value";
        String[] words = {"Zero ", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine "};
        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        String stringNum = String.valueOf(num);
        String[] wordsOfNum = new String[stringNum.length()];
        String joinString1 = "";
        for (int i = 0; i < stringNum.length(); i++) {
            String chars = Character.toString(stringNum.charAt(i));
            int intChars = Integer.parseInt(chars);
            ;
            joinString1 += words[intChars];
        }

        return joinString1.trim();

    }

}