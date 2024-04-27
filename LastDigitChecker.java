public class LastDigitChecker {

    /*
    CODING EXERCISE INSTRUCTIONS
    Write a method named hasSameLastDigit with three parameters of type int.
    Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
    The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.

    Write a method named hasSameLastDigit with three parameters of type int.
    Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
    The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.
    */

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if ((num1 < 10 || num1 > 1000) || (num2 < 10 || num2 > 1000) || (num3 < 10 || num3 > 1000)) {
            return false;
        }

        int num1LastDigit = 0;
        int num2LastDigit = 0;
        int num3LastDigit = 0;

        while (true) {
            num1LastDigit = num1 % 10;
            num2LastDigit = num2 % 10;
            num3LastDigit = num3 % 10;
            break;
        }

        if (num1LastDigit == num2LastDigit || num2LastDigit == num3LastDigit || num1LastDigit == num3LastDigit) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValid(int num) {
        if (num < 10 || num > 1000) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }
}
