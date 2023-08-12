import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(inputStream);
        System.out.println("Enter a String:");
        String inputString = read.readLine();

        String reverseOfInputString1 = iterativeStringReverse(inputString);
        System.out.println("The reversed string (using iterative reversal): " + reverseOfInputString1);

        String reverseOfInputString2 = recursiveStringReverse(inputString);
        System.out.printf("The reversed string (using recursive reversal): %s%n", reverseOfInputString2);

        String reverseOfInputString3 = new StringBuilder(inputString).reverse().toString();
        System.out.printf("The reversed string (using \"new StringBuilder(<origString>).reverse()\" function): %s%n", reverseOfInputString3);
    }

    public static String iterativeStringReverse(String strToBeReversed){
        StringBuilder reversedString = new StringBuilder();
        for (int i = 0; i < strToBeReversed.length(); i++){
            reversedString.insert(0, strToBeReversed.charAt(i));
        }
        return reversedString.toString();
    }

    public static String recursiveStringReverse(String strToBeReversed){
        if (strToBeReversed.length() < 2) return strToBeReversed;
        return recursiveStringReverse(strToBeReversed.substring(1)) + strToBeReversed.charAt(0);
    }
}
