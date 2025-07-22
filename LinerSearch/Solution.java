import java.io.*;
import java.math.*;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        for (int i = 1; i <=10; i++) {
          int ans =   Math.multiplyExact(N , i);
          String multiple = String.format("%d X %d = %d" , N ,i , ans );
            System.out.println(multiple);


        }
    }
}
