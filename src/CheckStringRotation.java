import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckStringRotation {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(inputStream);
        System.out.println("Enter 1st String:");
        String inputString1 = read.readLine();
        System.out.println("Enter 2nd String");
        String inputString2 = read.readLine();

        if (inputString2.length() != inputString1.length()) {
            System.out.printf("The 2nd string \"%s\" is not a valid rotation of the 1st string \"%s\"", inputString2, inputString1);
        }
        else {
            String concatOrigString = inputString1.concat(inputString1);
            if (concatOrigString.contains(inputString2))
                System.out.printf("The 2nd string \"%s\" is a valid rotation of the 1st string \"%s\"", inputString2, inputString1);
            else
                System.out.printf("The 2nd string \"%s\" is not a valid rotation of the 1st string \"%s\"", inputString2, inputString1);
        }
    }
}
