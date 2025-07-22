import java.util.Arrays;
import java.util.Scanner;

public class Search2D {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11}
        };
        Scanner in = new Scanner(System.in);

        int[] ans = search(arr, in.nextInt());

        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int Target) { // this is how we can make the array method
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == Target){

                    return new int[]{i, j}; // here we need to initialize the array

                }

            }
        }
        return new int[]{-1,-1}; // if it's not found it will return -1
    }
}
