import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class CharacterOccurrenceInString {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStream);

        System.out.println("Enter a string:");
        String inputString = bufferedReader.readLine();
        String modifiedString = inputString.replace(" ", "");

        HashSet<Character> charSet = new HashSet<>();
        for (int i = 0; i < modifiedString.length(); i++) {
            charSet.add(modifiedString.charAt(i));
        }

        for(char cht : charSet){
            int charCount = 0;
            for (int i = 0; i < modifiedString.length(); i++) {
                if (cht == modifiedString.charAt(i))
                    charCount++;
            }
            System.out.println("The number of occurrences of " + cht + " is: " + charCount);
        }

    }
}
