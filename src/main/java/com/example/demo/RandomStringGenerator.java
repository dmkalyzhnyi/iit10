package com.example.demo;

import java.util.Random;

public class RandomStringGenerator {

    // Define the character set
    private static final String CHAR_SET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    // Method to generate a random string of a given length
    public static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            // Generate a random index to pick a character from CHAR_SET
            int randomIndex = random.nextInt(CHAR_SET.length());
            // Append the character to the StringBuilder
            stringBuilder.append(CHAR_SET.charAt(randomIndex));
        }

        return stringBuilder.toString();
    }
}