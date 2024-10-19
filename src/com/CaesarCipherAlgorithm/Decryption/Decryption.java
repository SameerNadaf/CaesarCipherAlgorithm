package com.CaesarCipherAlgorithm.Decryption;
import com.CaesarCipherAlgorithm.Encryption.HelperClass;

import java.sql.SQLException;

public class Decryption {
    public void decryptionAlgorithm(String cipherText, int key) {
        String inputString = cipherText.toLowerCase();
        char[] chars = inputString.toCharArray();
        char[] outArray = new char[cipherText.length()];

        for (int i = 0; i < cipherText.length(); i++) {
            if (chars[i] == ' '){
                outArray[i] = ' ';
                continue;
            }
            int value = HelperClass.getValue(chars[i]);
            int mod = (value - key) % 26;
            if (mod < 0){
                mod = mod + 26;
            }
            char ch = HelperClass.getChar(mod);
            outArray[i] = ch;
        }

        String plainText = new String(outArray).toUpperCase();

        System.out.println();
        System.out.println("The Decrypted message is :" + plainText);
    }

}
