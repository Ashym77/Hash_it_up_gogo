package org.example.hex;

public class HexConverter {

    public  String convertToHex(String input) {
        StringBuilder hexStringBuilder = new StringBuilder();

        for (char ch : input.toCharArray()) {
            String hex = String.format("%02x", (int) ch);
            hexStringBuilder.append(hex);
        }

        return hexStringBuilder.toString();
    }
}