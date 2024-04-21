package com.salafiaji.thetrustbank.utils;

import java.time.Year;

public class AccountUtils {

    public static final String ACCOUNT_EXISTS_CODE = "001";
    public static final String ACCOUNT_EXISTS_MESSAGE = "This user already has an account created";
    public static final String ACCOUNT_CREATION_SUCCESS = "002";
    public static final String ACCOUNT_CREATION_MESSAGE = "Account Created successfully!";
    public static final String ACCOUNT_NOT_EXIST_CODE = "003";
    public static final String ACCOUNT_NOT_EXIST_MESSAGE = "User with the provided Account does not exist";
    public static final String ACCOUNT_FOUND_CODE = "004";
    public static final String ACCOUNT_FOUND_SUCCESS = "User Account Found";
    public static final String ACCOUNT_CREDITED_SUCCESS = "005";
    public static final String ACCOUNT_CREDITED_SUCCESS_MESSAGE = "User Account Credited";
    public static final String INSUFFICIENT_BALANCE_CODE = "006";
    public static final String INSUFFICIENT_BALANCE_MESSAGE = "Insufficient Balance";
    public static final String ACCOUNT_DEBITED_SUCCESS = "007";
    public static final String ACCOUNT_DEBITED_MESSAGE = "Account has been debited";
    public static final String TRANSFER_SUCCESSFUL_CODE = "008";
    public static final String TRANSFER_SUCCESSFUL_MESSAGE = "Transfer Successful";



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
