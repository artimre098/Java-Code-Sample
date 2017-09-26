
/**
 * Given an array of ints, return a new array length 2 containing the first and last elements
 * from the original array.The original array will be length 1 or more.
 * 
 * @author (artimre098) 
 * @version (9/25/17)
 */
import java.util.*;
public class makeEnds
{
    public static void main(String [] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Please input the lenght of your array: ");
        int arrLength = in.nextInt();
        System.out.println(" ");

        int arr [] = new int [arrLength];
        System.out.println("Enter the elements of your array");
        for(int x = 0 ; x < arr.length ; x++){
            System.out.print("input> ");
            arr[x] = in.nextInt();
        }

        System.out.print('\u000C');

        int newArr[] = new int[2];
        newArr[0] = arr[0];
        newArr[1] = arr[arr.length-1];

        System.out.print("Your Array:  ");
        for(int x = 0 ; x < arr.length ; x++){
            System.out.print(arr[x] + " ");
        }
        System.out.println("\n");
        System.out.println("New Array Containing the first and last element");
        for(int x = 0 ; x < newArr.length ; x++){
            System.out.print(newArr[x] + " ");
        }

    }
}
