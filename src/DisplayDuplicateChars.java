import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DisplayDuplicateChars {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(inputStream);
        System.out.println("Enter a String:");
        String inputString = read.readLine();

        final HashMap<Character, Integer> duplicateCharCount = getCharacterIntegerHashMap(inputString);

        //System.out.println("HashMap content: " + duplicateCharCount);
        StringBuilder outputString = new StringBuilder();
        System.out.print("The duplicate characters are: '");
        for (Map.Entry<Character, Integer> element :
             duplicateCharCount.entrySet()) {
            if(element.getValue() > 1)
                outputString.append(element.getKey()).append("', '");
        }

        String outString = outputString.substring(0, outputString.toString().lastIndexOf(","));
        System.out.println(outString);

    }

    private static HashMap<Character, Integer> getCharacterIntegerHashMap(String inputString) {
        HashMap<Character, Integer> duplicateCharCount = new HashMap<>();
        duplicateCharCount.put(inputString.charAt(0), 1);
        for (int i = 1; i < inputString.length(); i++){
            char singleChar = inputString.charAt(i);
            if (singleChar == ' ')
                continue;
            if (duplicateCharCount.containsKey(singleChar)){
                int k = duplicateCharCount.get(singleChar);
                k++;
                duplicateCharCount.put(singleChar, k);
            }
            else {
                duplicateCharCount.put(singleChar, 1);
            }
        }
        return duplicateCharCount;
    }
}
