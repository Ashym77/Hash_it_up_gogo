package org.example;

import org.example.Algorithms.BinaryAlgorithm;
import org.example.binary.BinaryConverter;
import org.example.hex.HexConverter;

public class Main {
    public static void main(String[] args) {
        BinaryConverter binaryConverter = new BinaryConverter();
        HexConverter hexConverter = new HexConverter();
        BinaryAlgorithm binaryAlgorithm = new BinaryAlgorithm();

        //user input
        String password = "Himpus123";
        String newPassword = changeValuesOfPw(password);


        String binaryPassword = binaryConverter.convertToBinary(newPassword);
        String hexPassword = hexConverter.convertToHex(newPassword);


        //System.out.println(binaryPassword + "      CHAR COUNT: " + countChars(binaryPassword));
        //System.out.println(hexPassword + "      CHAR COUNT: " + countChars(hexPassword));
        //StringBuilder sb = new StringBuilder();

        /*
        System.out.println(binaryAlgorithm.combineHex(binaryAlgorithm.convertBinaryToHex(binaryAlgorithm.splitBinary(binaryPassword)))
                + "      CHAR COUNT: " + countChars(binaryAlgorithm.combineHex(binaryAlgorithm.convertBinaryToHex(binaryAlgorithm.splitBinary(binaryPassword)))));
        */

        HashFunction hashFunction = new HashFunction();

        System.out.println(hashFunction.hash("Fredrik123"));
    }

    private static int countChars(String input) {
        return input.length();
    }

    private static String changeValuesOfPw(String passwordInput) {
        StringBuilder sb = new StringBuilder();
        char previousChar = ' ';
        for (char character : passwordInput.toCharArray()) {
            System.out.print(character + previousChar + " = ");
            character += previousChar;
            System.out.println(character);
            sb.append(character);
            previousChar = character;
        }

        System.out.println(sb + "   BEFORE REVERSE");
        String newString = sb.reverse().toString();

        for (char character : newString.toCharArray()) {
            System.out.print(character + previousChar + " = ");
            character += previousChar;
            System.out.println(character);
            sb.append(character);
            previousChar = character;
        }

        System.out.println(sb + "     AFTER REVERSE");
        return sb.toString();
    }
}