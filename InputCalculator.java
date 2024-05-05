import java.util.Scanner;

public class InputCalculator {

    /*
    CODING EXERCISE INSTRUCTIONS
    Write a method called inputThenPrintSumAndAverage that does not have any parameters.
    The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
    When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
    XX represents the sum of all entered numbers of type int.
    YY represents the calculated average of all numbers of type long.
    */

    public static void inputThenPrintSumAndAverage() {

        String userNumber;
        double convertNumber = 0;
        double sum = 0;
        double avg = 0;
        long counter = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number: ");
            try {
                userNumber = scanner.nextLine();
                convertNumber = Double.parseDouble(userNumber);
                if (convertNumber < 0) {
                    System.out.println("Only enter positive numbers.");
                } else {
                    sum += (int) convertNumber;
                    avg += Math.round(convertNumber);
                    counter++;
                }
            } catch (NumberFormatException e) {
                if (counter == 0) {
                    sum = 0;
                    avg = 0;
                    System.out.println("SUM = " + sum + " AVG = " + avg);
                    break;
                }
                avg = avg / counter;
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
        }
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
