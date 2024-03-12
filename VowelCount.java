package myjava.src;

import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase(); // Convert the string to lowercase

        // Count vowels and consonants
        int vowelsCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelsCount += 1;
                } else {
                    consonantCount += 1;
                }
            }
        }
        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantCount);
        sc.close();
    }
}
