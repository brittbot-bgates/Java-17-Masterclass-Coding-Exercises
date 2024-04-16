public class TeenNumberChecker {

    /*
    CODING EXERCISE INSTRUCTIONS
    We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
    Write a method named hasTeen with 3 parameters of type int.
    The method should return boolean and it needs to return true if one of the parameters is in range 13 (inclusive) - 19 (inclusive). Otherwise return false.

    Write another method named isTeen with 1 parameter of type int.
    The method should return boolean and it needs to return true if the parameter is in range 13 (inclusive) - 19 (inclusive). Otherwise return false.
    */

    public static boolean hasTeen(int age1, int age2, int age3) {
        if ((age1 >= 13) || (age2 >= 13) || (age3 >= 13)) {
            if ((age1 <= 19 && age1 >= 13) || (age2 <= 19 && age2 >= 13) || (age3 <=19 && age3 >= 13)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean isTeen(int teenAge) {
        if (teenAge >= 13) {
            if (teenAge <= 19 && teenAge >= 13) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));

    }
}
