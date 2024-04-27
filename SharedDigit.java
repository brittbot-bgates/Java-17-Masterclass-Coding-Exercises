public class SharedDigit {

    /*
    CODING EXERCISE INSTRUCTIONS
    Write a method named hasSharedDigit with two parameters of type int.
    Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
    The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
    */

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num2 > 99) {
            return false;
        } else if (num1 > 99 || num2 < 10) {
            return false;
        }

        while (true) {
            int num1FirstDigit = num1 % 10;
            int num2FirstDigit = num2 % 10;
            num1 /= 10;
            num2 /= 10;

            int num1SecondDigit = num1 % 10;
            int num2SecondDigit = num2 % 10;
            if (num1FirstDigit == num2SecondDigit || num1SecondDigit == num2FirstDigit) {
                return true;
            } else if (num1SecondDigit == num2SecondDigit || num1FirstDigit == num2FirstDigit) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(9, 9));
        System.out.println(hasSharedDigit(100, 10));
        System.out.println(hasSharedDigit(19, 99));
        System.out.println(hasSharedDigit(12, 43));
        System.out.println(hasSharedDigit(12, 13));
    }
}
