import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Read the integer input
        int n = Integer.parseInt(reader.readLine());

        // TODO: Increment n by 1
        n = n + 1;

        // TODO: Decrement n by 2
         n = n - 2;

        // TODO: Double the resulting value of n
        n = n * 2;
        // Print the final value of n
        System.out.println(n);
    }
}