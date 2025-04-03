import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraySum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] numbers = new int[n];
        String[] input = bufferedReader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        long total = 0;

        for (int number: numbers) {
            total += number;
        }

        System.out.println(total);
    }
}
