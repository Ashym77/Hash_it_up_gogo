package org.example;

import org.example.hex.HexConverter;

public class HashFunction {

    public String hash(String input) {

        input = checkPasswordLength(input);
        HexConverter hexConverter = new HexConverter();
        return hexConverter.convertToHex(changeValuesOfPw(input));

    }

    private String checkPasswordLength(String password){
        StringBuilder passwordBuilder = new StringBuilder(password);
        while (passwordBuilder.length() < 32){
            // add extra chars
            passwordBuilder.append("0");
            //while (password.length() < 16){}

        }
        password = passwordBuilder.toString();


        return password;
        //splitBinary(password);

    }

    private String changeValuesOfPw(String passwordInput) {
        StringBuilder sb = new StringBuilder();
        char previousChar = ' ';
        for (char character : passwordInput.toCharArray()) {
            //System.out.print(character + previousChar + " = ");
            character += previousChar;
            //System.out.println(character);
            sb.append(character);
            previousChar = character;
        }

        //System.out.println(sb + "   BEFORE REVERSE");
        String newString = sb.reverse().toString();

        for (char character : newString.toCharArray()) {
            //System.out.print(character + previousChar + " = ");
            character += previousChar;
            //System.out.println(character);
            sb.append(character);
            previousChar = character;
        }

        //System.out.println(sb + "     AFTER REVERSE");
        sb.setLength(32);
        return sb.toString();
    }
}
