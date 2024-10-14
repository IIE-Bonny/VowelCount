/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ice.tasksix;
import java.util.Scanner;
/**
 *
 * @author B.O.N.N.Y
 */
public class IceTaskSix {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        int vowelCount = countVowels(sentence);
        System.out.println("Number of vowels: " + vowelCount);
    }

    /**
     * Returns the number of vowels in a given string.
     * 
     * @param sentence the input string
     * @return the number of vowels
     */
    public static int countVowels(String sentence) {
        // Convert sentence to lowercase for simplicity
        sentence = sentence.toLowerCase();

        int vowelCount = 0;
        String vowels = "aeiou";

        // Iterate through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            // Check if the character is a vowel
            if (vowels.indexOf(c) != -1) {
                vowelCount++;
            }
        }

        return vowelCount;
    }
}


