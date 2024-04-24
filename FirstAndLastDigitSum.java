public class FirstAndLastDigitSum {

    /*
    CODING EXERCISE INSTRUCTIONS
    Write a method named sumFirstAndLastDigit with one parameter of type int called number.
    The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return the sum of the first and the last digit of that number.
    If the number is negative then the method needs to return -1 to indicate an invalid value.
    */

    public static int sumFirstAndLastDigit(int number) {
        int firstDigit = 0;
        int lastDigit;
        int sum;

        if (number < 0) {
            return -1;
        }

        // Use n % 10 to extract the right-most digit
        lastDigit = number % 10;

        // To catch the cases where there is only one digit in the number parameter
        if (number == 0) {
            firstDigit = lastDigit;
        }

        if (number < 9) {
            firstDigit = number % 10;
        }

        while (number >= 10) {
            // Use n = n / 10 to drop the last digit while looping
            number /= 10;

            // Use n % 10 to extract the left-most digit
            if (number <= 9) {
                firstDigit = number % 10;
            }
        }
        sum = lastDigit + firstDigit;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
        System.out.println(sumFirstAndLastDigit(3322));
        System.out.println(sumFirstAndLastDigit(99));
    }
}
