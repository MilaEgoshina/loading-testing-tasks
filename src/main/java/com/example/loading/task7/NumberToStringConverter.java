package com.example.loading.task7;

public class NumberToStringConverter {

    private static final String[] DIGITS = {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
    private static final String[] TEENS = {"", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
    private static final String[] TENS = {"", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
    private static final String[] HUNDREDS = {"", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
    private static final String[] THOUSANDS = {"", "тысяча", "тысячи", "тысяч"};

    public static String convertNumberToString(int number) {
        if (number == 0) {
            return "ноль";
        }

        StringBuilder result = new StringBuilder();

        int millions = number / 1000000;
        int thousands = (number % 1000000) / 1000;
        int units = number % 1000;

        if (millions > 0) {
            result.append(convertThreeDigitNumber(millions)).append(" миллионов ");
        }

        if (thousands > 0) {
            result.append(convertThreeDigitNumber(thousands)).append(" ");
            result.append(getNumberString(thousands, THOUSANDS));
            if (units > 0) {
                result.append(" ");
            } else {
                return result.toString().trim();
            }
        }

        if (units > 0) {
            result.append(convertThreeDigitNumber(units));
        }

        return result.toString().trim();
    }

    private static String convertThreeDigitNumber(int number) {
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int units = number % 10;

        StringBuilder result = new StringBuilder();

        if (hundreds > 0) {
            result.append(HUNDREDS[hundreds]).append(" ");
        }

        if (tens == 1) {
            result.append(TEENS[units]).append(" ");
        } else {
            result.append(TENS[tens]).append(" ");
            result.append(DIGITS[units]).append(" ");
        }

        return result.toString().trim();
    }

    private static String getNumberString(int number, String[] forms) {
        if (number % 100 > 4 && number % 100 < 21) {
            return forms[3];
        }
        if (number % 10 == 1) {
            return forms[1];
        }
        if (number % 10 > 1 && number % 10 < 5) {
            return forms[2];
        }
        return forms[3];
    }

    public static void main(String[] args) {
        int number = 1020;
        System.out.println(convertNumberToString(number)); // "одна тысяча двадцать"
    }
}
