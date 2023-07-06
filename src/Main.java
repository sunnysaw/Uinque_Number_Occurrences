/*
Question : Given an array of integers arr, return true if the number of occurrences of each value in the array is unique
          or false otherwise.
________________________________________________________________________________________________________________________
Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start, sizeOfArray, secondStart, uniqueNumber = 0;
        System.out.println("Enter the length of array : ");
        sizeOfArray = input.nextInt();
        System.out.println("Enter the element inside array : ");
        int[] array = new int[sizeOfArray];
        for (start = 0; start < array.length; start++) {
            array[start] = input.nextInt();
        }
        System.out.println("Printing the result :");
        for (start = 0; start < array.length - 1; start++) {
            for (secondStart = start + 1; secondStart < array.length; secondStart++) {
                if (array[start] == array[secondStart]) {
                    uniqueNumber++;
                }
            }
        }
        if (uniqueNumber > 1){
            System.out.println(true);
        }else
            System.out.println(false);
    }
}
