package com.digitalleague;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public static boolean isExpressionValid(String expression) {
        String divByZeroRegex = "/\\s*0"; // Проверяет деление на 0
        String validateRegex = "^-?\\d+\\s*[+-/*]\\s*(\\(-(\\d+|\\d+\\.\\d+)\\)|(\\d+|\\d+\\.\\d+))\\s*([+\\-*\\/]\\s*(\\(-(\\d+|\\d+\\.\\d+)\\)|(\\d+|\\d+\\.\\d+))+\\s*)*$";
        Pattern pattern = Pattern.compile(divByZeroRegex);
        Matcher matcher = pattern.matcher(expression);

        if (!Pattern.matches(validateRegex, expression)) {
            System.out.println("Не верный формат, попробуйте еще раз");
            return false;
        } else if (matcher.find()) {
            System.out.println("Попытка делить на 0");
            return false;
        }

        return true;
    }
}