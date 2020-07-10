package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        String result = "";
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int ones = number % 10;
        boolean isSpecialNum = false;
        boolean isLowerThan1000 = false;

        if (number >= 10 && number < 20) {
            isSpecialNum = true;
        }

        if (number < 1000) {
            isLowerThan1000 = true;
        }

        if (isLowerThan1000) {
            switch (hundreds) {
                case 0:
                    break;
                case 1:
                    result = "one";
                    break;
                case 2:
                    result = "two";
                    break;
                case 3:
                    result = "three";
                    break;
                case 4:
                    result = "four";
                    break;
                case 5:
                    result = "five";
                    break;
                case 6:
                    result = "six";
                    break;
                case 7:
                    result = "seven";
                    break;
                case 8:
                    result = "eight";
                    break;
                case 9:
                    result = "nine";
                    break;
                default:
                    result = "out of ability";
            }

            if (hundreds != 0) {
                result += " " + "hundred" + " " + "and" + " ";
            }

            switch (tens) {
                case 0:
                    break;
                case 1:
                    isSpecialNum = true;
                    tens = number % 10;
                    break;
                case 2:
                    result += "twenty";
                    break;
                case 3:
                    result += "thirty";
                    break;
                case 4:
                    result += "forty";
                    break;
                case 5:
                    result += "fifty";
                    break;
                case 6:
                    result += "sixty";
                    break;
                case 7:
                    result += "seventy";
                    break;
                case 8:
                    result += "eighty";
                    break;
                case 9:
                    result += "ninety";
                    break;
                default:
                    result = "out of ability";
            }

            if (!isSpecialNum) {
                if (tens != 0) {
                    result += " ";
                }
                switch (ones) {
                    case 0:
                        if (hundreds == 0 & tens == 0) {
                            result += "zero";
                        }
                        break;
                    case 1:
                        result += "one";
                        break;
                    case 2:
                        result += "two";
                        break;
                    case 3:
                        result += "three";
                        break;
                    case 4:
                        result += "four";
                        break;
                    case 5:
                        result += "five";
                        break;
                    case 6:
                        result += "six";
                        break;
                    case 7:
                        result += "seven";
                        break;
                    case 8:
                        result += "eight";
                        break;
                    case 9:
                        result += "nine";
                        break;
                    default:
                        result = "out of ability";
                }
            }

            if (isSpecialNum) {
                switch (tens) {
                    case 0:
                        result += "ten";
                        break;
                    case 1:
                        result += "eleven";
                        break;
                    case 2:
                        result += "twelve";
                        break;
                    case 3:
                        result += "thirteen";
                        break;
                    case 4:
                        result += "fourteen";
                        break;
                    case 5:
                        result += "fifteen";
                        break;
                    case 6:
                        result += "sixteen";
                        break;
                    case 7:
                        result += "seventeen";
                        break;
                    case 8:
                        result += "eighteen";
                        break;
                    case 9:
                        result += "nineteen";
                        break;
                    default:
                        result = "out of ability";
                }
            }
        }

        if (!isLowerThan1000) {
            result += "out of ability";
        }

        System.out.printf("The number %d is read: %s", number, result);
    }
}