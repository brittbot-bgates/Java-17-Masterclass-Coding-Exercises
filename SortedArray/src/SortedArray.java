import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int size) {
        int[] numberArray = new int[size];
        int number;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            System.out.print("Enter an Integer: ");
            number = scanner.nextInt();
            int[] newArray = Arrays.copyOf(numberArray, size);
            newArray[i] = number;
            numberArray = Arrays.copyOf(newArray, size);
        }

        return numberArray;
    }

    public static int[] sortIntegers(int[] numberArray) {
        int[] sortedArray = Arrays.copyOf(numberArray, numberArray.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }

    public static void printArray(int[] numberArray) {

        for (int i=0; i < numberArray.length; i++) {
            System.out.println("Element " + i + " contents " + numberArray[i]);
        }
    }

    public static void main(String[] args) {

        printArray(sortIntegers(getIntegers(5)));

    }
}
