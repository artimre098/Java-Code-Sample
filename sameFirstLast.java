
/**
 * Given an array of int,return TRUE if the array length is 1 or more, and the first
 * element and the last element are equal.
 * 
 * @author (artimre098) 
 * @version (9/25/17)
 */

import java.util.*;
public class sameFirstLast
{
    public static void main(String [] args){
            Scanner in = new Scanner(System.in);
            
            System.out.print("Please input the lenght of your array: ");
            int arrLength = in.nextInt();
            System.out.println(" ");
            
            int arr [] = new int [arrLength]; // the user will enter the length of our array
            System.out.println("Enter the elements of your array"); // the user will enter elements
            for(int x = 0 ; x < arr.length ; x++){
                System.out.print("input> ");
                arr[x] = in.nextInt();
            }
            
            // check either the first and last are equal
            
            if(arr[0] == arr[arr.length-1]){
                System.out.println("the first and last element are equal");
                System.out.println(arr[0] + " = " + arr[arr.length-1]);
            }else{
                System.out.println("the first and last element are NOT equal");
                System.out.println(arr[0] + " = " + arr[arr.length-1]);
            }
    }
}
