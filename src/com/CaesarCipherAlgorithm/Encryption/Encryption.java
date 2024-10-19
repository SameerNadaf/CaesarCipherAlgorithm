package com.CaesarCipherAlgorithm.Encryption;

public class Encryption {
    public void encryptionAlgorithm(String text, int key) {
        String input = text.toLowerCase();
        char[] chars = input.toCharArray();
        char[] outChars = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            if (chars[i] == ' '){
                outChars[i] = ' ';
                continue;
            }
            int value = HelperClass.getValue(chars[i]);
            int mod = (value + key) % 26;
            char ch = HelperClass.getChar(mod);
            outChars[i] = ch;
        }

        String cipherText = new String(outChars).toUpperCase();

        System.out.println();
        System.out.println("The Encrypted message is : " + cipherText);
    }

}
