
/**
 * Given an array of ints length 3, figure out which is larger, the first or last element in the array, 
 * and set all the other elements to be that value. Return the changed array.
 * 
 * @author (artimre098) 
 * @version (9/25/17)
 */
import java.util.*;
public class maxEnd3
{
    public static void main(String [] args){
        int arr[] = new int [3];
        Scanner in = new Scanner(System.in);

        System.out.println("input elements");
        for(int x = 0; x < arr.length ; x ++){
            System.out.print("input > ");
            arr[x] = in.nextInt();
        }
        System.out.print('\u000C'); // to clear the screen
        System.out.print("Array: ");
        for(int x = 0; x < arr.length ; x ++){ // to output the elements of your array
            System.out.print(arr[x] + " ");
        }
        int temp = 0;
        if( arr[0] > arr[arr.length-1]){ // always remember that the index always start with 0
            temp = arr[0];
            System.out.print("\nNew Array: ");
            for(int x = 0; x < arr.length ; x ++){
                
                arr[x] = temp;
                System.out.print(arr[x] + " " );
            }
        }else if(arr[0] < arr[arr.length-1]) {
            temp = arr[arr.length-1];
            System.out.print("New Array: ");
            for(int x = 0; x < arr.length ; x ++){
                
                arr[x] = temp;
                System.out.print(arr[x] + " " );
            }
        }
    }
}
