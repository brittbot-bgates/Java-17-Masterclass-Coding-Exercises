/*
Write a method called readInteger() that has no parameters and returns an int.
It needs to read in an integer from the user - this represents how many elements the user needs to enter.
Write another method called readElements() that has one parameter of type int
The method needs to read from the console until all the elements are entered, and then return an array containing the elements entered.
*/


import java.util.Scanner;

public class Main {

    private static int readInteger() {
        int userNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the quantity of Integers will you enter below: ");
        userNumber = scanner.nextInt();

        return userNumber;
    }

    private static int[] readElements(int userNumber) {
        int[] array = new int[userNumber];
        for (int i = 0; i < userNumber; i++) {
            System.out.print("Enter the " + (i + 1) + " of the " + userNumber + " Integers here: ");
            Scanner scanner = new Scanner(System.in);
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static int findMin(int[] newArray) {
        int lowest = newArray[0];

        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] < lowest) {
                lowest = newArray[i];
            }
        }

        return lowest;
    }

    public static void main(String[] args) {

        System.out.println(findMin(readElements(readInteger())));

    }
}
