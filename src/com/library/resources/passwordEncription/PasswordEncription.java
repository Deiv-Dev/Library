package com.library.passwordEncription;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordEncription {
    // Password MD5 hashing encryption
    public static String encryptString(String input) throws NoSuchAlgorithmException {
        MessageDigest hashedPassword = MessageDigest.getInstance("MD5");

        byte[] messageDigest = hashedPassword.digest(input.getBytes());

        BigInteger bigInt = new BigInteger(1, messageDigest);
        System.out.println(bigInt.toString(16));
        return bigInt.toString(16);
    }
}
