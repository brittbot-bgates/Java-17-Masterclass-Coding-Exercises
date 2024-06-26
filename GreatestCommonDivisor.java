public class GreatestCommonDivisor {

    /*
    CODING EXERCISE INSTRUCTIONS
    Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
    If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
    The method should return the greatest common divisor of the two numbers (int).
    The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).

    For example 12 and 30:
    12 can be divided by 1, 2, 3, 4, 6, 12
    30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30
    The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no resulting remainder.
    */

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int firstDivisor = 0;
        int secondDivisor = 0;
        int greatestDivisor = 0;

        if (first < second) {
            for (int i = 1; i <= first; i++) {
                if (first % i == 0 && second % i == 0) {
                    firstDivisor = i;
                    secondDivisor = i;
                } else if (firstDivisor == secondDivisor) {
                    greatestDivisor = firstDivisor;
                }
            }
        } else {
            // Add one more iteration so the loop completes properly and updates greatDivisor if there is a final greatest common divisor
            for (int i = 1; i <= second + 1; i++) {
                if (second % i == 0 && first % i == 0) {
                    secondDivisor = i;
                    firstDivisor = i;
                } else if (secondDivisor == firstDivisor) {
                    greatestDivisor = secondDivisor;
                }
            }
        }
        return greatestDivisor;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
        System.out.println(getGreatestCommonDivisor(1010, 10));
    }
}
