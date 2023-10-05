package org.example;

public class Decoder {

    public static String decodeVowelReplacement(String message) {
        StringBuilder decodedMessage = new StringBuilder();
        StringBuilder currentCode = new StringBuilder();

        for (char c : message.toCharArray()) {
            if (Character.isDigit(c)) {
                currentCode.append(c);
            } else {
                if (currentCode.length() > 0) {
                    int code = Integer.parseInt(currentCode.toString());
                    char decodedChar;
                    switch (code) {
                        case 1: decodedChar = 'a'; break;
                        case 2: decodedChar = 'e'; break;
                        case 3: decodedChar = 'i'; break;
                        case 4: decodedChar = 'o'; break;
                        case 5: decodedChar = 'u'; break;
                        case 6: decodedChar = 'y'; break;
                        default: decodedChar = ' ';
                    }
                    decodedMessage.append(decodedChar);
                    currentCode.setLength(0);
                }
                decodedMessage.append(c);
            }
        }
        return decodedMessage.toString();
    }

    public static String decodeConsonantReplacement(String message) {
        StringBuilder decodedMessage = new StringBuilder();

        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiouy".indexOf(Character.toLowerCase(c)) == -1) {
                    char decodedChar = (char) (c + 1);
                    if (decodedChar > 'z') {
                        decodedChar = 'a';
                    }
                    decodedMessage.append(decodedChar);
                } else {
                    decodedMessage.append(c);
                }
            } else {
                decodedMessage.append(c);
            }
        }
        return decodedMessage.toString();
    }

    public static void main(String[] args) {
        String encodedMessage = "srujigile"; //t2st3ng => testing; srujigile => tsukihime

        if (encodedMessage.matches(".*[0-9]+.*")) {
            System.out.println("Encoded Message: " + encodedMessage + "\nDecoded Message: " + decodeVowelReplacement(encodedMessage));
        } else if (encodedMessage.matches(".*[a-z]+.*")) {
            System.out.println("Encoded Message: " + encodedMessage + "\nDecoded Message: " + decodeConsonantReplacement(encodedMessage));
        } else {
            System.out.println("Try Again");
        }
    }
}