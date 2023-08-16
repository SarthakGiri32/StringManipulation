import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class RecursiveStringPermutation {
    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String: ");
        String inputString = read.readLine();

        System.out.printf("%nThe various permutations of the string \"%s\":%n", inputString);
        printStringPermutations(inputString);

        System.out.printf("%nThe number of permutations = %d%n", calculateFactorial(inputString.length()));

    }

    public static void printStringPermutations(String permuteString){
        generateStringPermutations("", permuteString);
    }

    public static void generateStringPermutations(String perm, String word){
        if (word.isEmpty()){
            System.out.println(perm + word);
        }

        for (int i = 0; i < word.length(); i++){
            generateStringPermutations(perm + word.charAt(i),
                    word.substring(0, i) + word.substring(i + 1));
        }
    }

    public static BigInteger calculateFactorial(int inputNumber){
        BigInteger factorialOutput = BigInteger.ONE;
        for(int i = 2; i <= inputNumber; i++){
            factorialOutput = factorialOutput.multiply(BigInteger.valueOf(i));
        }
        return factorialOutput;
    }
}
