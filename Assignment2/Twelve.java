package Assignment2;

import java.util.Arrays;
import java.util.Collections;


public class Twelve {

//    sorting in both descending and asscending order in 2d array

    public static void main(String[] args)
    {
        int[] [] arr = { {5, 1, 8, 0, 9, 4}, {2,4,6,7,8, 5} };

        Arrays.sort(arr[0]);
//        Arrays.sort(arr, Collections.reverseOrder());

        System.out.printf("arr[] : %s", Arrays.toString(arr));
    }
}
