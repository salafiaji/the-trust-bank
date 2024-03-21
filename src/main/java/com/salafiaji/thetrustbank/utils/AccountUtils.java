package com.salafiaji.thetrustbank.utils;

import java.time.Year;

public class AccountUtils {

    public static final String ACCOUNT_EXISTS_CODE = "001";
    public static final String ACCOUNT_EXISTS_MESSAGE = "This user already has an account created";
    public static final String ACCOUNT_CREATION_SUCCESS = "002";
    public static final String ACCOUNT_CREATION_MESSAGE = "Account Created successfully!";
    public static String generateAccountNumber() {
        //creates account num in the format below
        // 2024 + randomSixDigits
        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;
        int randomSixDigits = (int) (Math.random() * (max - min + 1) + min);
        //convert currentYear and randomSixDigits to String, then concatenate

        String year = String.valueOf(currentYear);
        String sixDigits = String.valueOf(randomSixDigits);
        StringBuilder accountNumber = new StringBuilder();

        return accountNumber.append(year).append(sixDigits).toString();
    }
}
