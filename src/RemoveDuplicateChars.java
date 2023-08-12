import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveDuplicateChars {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(inputStream);
        System.out.println("Enter a String:");
        String inputString = read.readLine();

        char[] charArray = new char[inputString.length()];
        charArray[0] = inputString.charAt(0);
        int k = 1;
        for (int i = 1; i < inputString.length(); i++){
            char searchChar = inputString.charAt(i);
            if (!new String(charArray).contains(String.valueOf(searchChar))){
                charArray[k] = searchChar;
                k++;
            }
        }
        //System.out.println("charArray content: " + Arrays.toString(charArray));
        String stringWithoutDuplicates = new String(charArray).trim();
        System.out.println("String without duplicates: " + stringWithoutDuplicates);

    }
}
