import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveRecurrCharInFirstStrFromSecondStr {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(inputStream);
        System.out.println("Enter 1st String:");
        String inputString1 = read.readLine();
        String inStr1LowCase = inputString1.toLowerCase();
        System.out.println("Enter 2nd String");
        String inputString2 = read.readLine();
        String inStr2LowCase = inputString2.toLowerCase();

        StringBuilder resultString = new StringBuilder();

        for (int i = 0; i < inputString1.length(); i++){
            if (!inStr2LowCase.contains(String.valueOf(inStr1LowCase.charAt(i)))){
                resultString.append(inputString1.charAt(i));
            }
        }

        System.out.println("The first string not containing characters in second string: " + resultString);
    }
}
