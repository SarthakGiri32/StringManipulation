import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateDownloadTime {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStream);

        System.out.println("Enter the game size in GB:");
        float inputFileSizeInGB = Float.parseFloat(bufferedReader.readLine());

        float inputFileSizeInMB = inputFileSizeInGB * 1024;

        System.out.println("Enter the download speed in MB/s:");
        float inputDownloadSpeedInMBps = Float.parseFloat(bufferedReader.readLine());

        float downloadTimeInSeconds = inputFileSizeInMB / inputDownloadSpeedInMBps;

        //Converting the time in seconds to hours, minutes and seconds
        int downloadTimeInHours = (int) downloadTimeInSeconds / 3600;
        int downloadTimeInMinutes = (int) (downloadTimeInSeconds % 3600) / 60;
        downloadTimeInSeconds = downloadTimeInSeconds % 60;

        System.out.println("The download time is: " + downloadTimeInHours + " hours, " + downloadTimeInMinutes + " minutes and " + downloadTimeInSeconds + " seconds");

    }
}
