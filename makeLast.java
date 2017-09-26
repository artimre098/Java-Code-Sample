
/**
 * Given an int array, return a new array with double the length where
 * its last element is the same as the original array, and all the other elements are 0. 
 * The original array will be length 1 or more.
 * Note: by default, a new int array contains all 0's.
 * 
 * @author (artimre098) 
 * @version (9/25/17)
 */
import java.util.*;
public class makeLast 
{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Please input the length of your array: ");
        int arrLength = in.nextInt();
        System.out.println(" ");

        int arr [] = new int [arrLength];
        System.out.println("Enter the elements of your array");
        for(int x = 0 ; x < arr.length ; x++){
            System.out.print("input> ");
            arr[x] = in.nextInt();
        }
        
        int newArr[] = new int [(arr.length) * 2];
        
        newArr[newArr.length-1] = arr[arr.length-1];
        
        // the purpose of output
        System.out.print("\nYour Array: ");
        for(int x = 0 ; x < arr.length ; x++){
            System.out.print(arr[x] + " ");
            
        }
        System.out.print("\nNew Array: ");
        for(int x = 0 ; x < newArr.length ; x++){
            System.out.print(newArr[x] + " ");
            
        }
    }
}
