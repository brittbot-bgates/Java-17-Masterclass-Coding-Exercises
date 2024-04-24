public class NumberPalindrome {

    /*
    CODING EXERCISE INSTRUCTIONS
    Write a method called isPalindrome with one int parameter called number.
    The method needs to return a boolean.
    It should return true if the number is a palindrome number otherwise it should return false.
    */

    public static boolean isPalindrome(int number) {
        // To store the reverse of the number parameter
        int reverse = 0;

        // To store the last digit of the number parameter
        int lastDigit;

        // To store the original number parameter so it can be used during the comparison
        int originalNumber = number;

        // use n % 10 to extract the right-most digit
        // use n = n / 10 to drop the last digit while looping
        while (true) {
            lastDigit = originalNumber % 10;
            reverse += lastDigit;
            reverse = reverse * 10;
            originalNumber /= 10;
            if (originalNumber == 0) {
                break;
            }
        }
        reverse = reverse / 10;

        // Compare the number parameter to the reverse variable
        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(11));
    }
}
