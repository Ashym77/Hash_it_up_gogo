package org.example.Algorithms;

import org.example.binary.BinaryConverter;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class BinaryAlgorithm {

    //make include the arrays here to easy work with them?


    public List<String> splitBinary(String test) {
        // save two chars to array to convert each position
        List<String> binarySplitList = new ArrayList<>();

        for (int i = 0; i < test.length(); i += 5) {
            String binaryDivider = test.substring(i, Math.min(i + 5, test.length()));
            binarySplitList.add(binaryDivider);
        }
        return binarySplitList;
    }

    public void checkPasswordLength(String password){
        if (password.length() < 16){
            // add extra chars

            //while (password.length() < 16){}

        }

        //splitBinary(password);

    }

    public List<String> convertBinaryToHex(List<String> binarySplitList) {
        List<String> hexList = new ArrayList<>();
        // for each 2 chars return that combination to hex

        for (String binaryString : binarySplitList) {
            //hexList.add(Integer.toHexString(Integer.parseInt(string)));
            int decimalValue = Integer.parseInt(binaryString, 2); // Convert binary string to decimal integer
            String hexString = Integer.toHexString(decimalValue); // Convert decimal integer to hexadecimal string
            hexList.add(hexString);
        }

        return hexList;
    }


    public String combineHex(List<String> hexList) {
        StringBuilder combinedHex = new StringBuilder();
        for (String string : hexList) {
            combinedHex.append(string);

            if (Pattern.matches(".*[a-z].*", string)){
                combinedHex.append("#");
            }
            System.out.println(combinedHex);
        }
        combinedHex.setLength(32);

        // reverse

        // return 16 chars at the end
        return combinedHex.toString();
    }



}