import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MonkAndRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        String[] inputLines = new String[testcases * 2];
        for(int i = 0; i < testcases * 2; i++){
            inputLines[i] = br.readLine();
        }
        for(int i = 0; i < inputLines.length - 1; i += 2){
            String[] numberAndRot = inputLines[i].split(" ");
            int intArrLength = Integer.parseInt(numberAndRot[0]);
            int rotationNum = Integer.parseInt(numberAndRot[1]);
            if(rotationNum >= intArrLength) {
                rotationNum = rotationNum % intArrLength;
            }
            String arrayString = inputLines[i + 1];
            String[] stringArray = arrayString.split(" ");
            int[] integerArray = new int[intArrLength];
            int j = 0;
            for (String s : stringArray) {
                integerArray[j] = Integer.parseInt(s);
                j++;
            }
            int[] rotatedArray = new int[intArrLength];
            System.arraycopy(integerArray, intArrLength - rotationNum, rotatedArray, 0, rotationNum);
            System.arraycopy(integerArray, 0, rotatedArray, rotationNum, intArrLength - rotationNum);
            System.out.println(Arrays.toString(rotatedArray).replaceAll("[\\[\\],]", ""));
        }
    }
}
