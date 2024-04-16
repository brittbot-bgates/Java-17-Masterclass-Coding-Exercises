public class DecimalComparator {

    /*
    CODING EXERCISE INSTRUCTIONS
    Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
    The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
    */

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        num1 *= 1000;
        num2 *= 1000;

        long newNum1 = (long) num1;
        long newNum2 = (long) num2;

        if (newNum1 == newNum2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}
