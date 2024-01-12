package org.example.binary;

public class BinaryConverter {

    public String convertToBinary(String inputPassword) {

        StringBuilder binaryStringBuilder = new StringBuilder();
        for (char character : inputPassword.toCharArray()) {

            String binary = Integer.toBinaryString(character);

            binary = String.format("%8s", binary).replace(' ', '0');
            binaryStringBuilder.append(binary).append(" ");
        }

        return binaryStringBuilder.toString().replaceAll("\\s", "");
    }

}
