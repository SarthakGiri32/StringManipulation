import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaximumOccurringChar {
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
        charArray = new String(charArray).trim().toCharArray();
        System.out.println("Unique Chars: " + Arrays.toString(charArray));

        int maxCharCount = 0;
        char maxCountChar = 'a';
        for (char c : charArray) {
            int charCount = 0;
            for (int j = 0; j < inputString.length(); j++) {
                if (c == inputString.charAt(j))
                    charCount++;
            }
            if (maxCharCount < charCount) {
                maxCharCount = charCount;
                maxCountChar = c;
            }
        }

        System.out.println("The Character with max count: " + maxCountChar + "; and the count: " + maxCharCount);
    }
}
