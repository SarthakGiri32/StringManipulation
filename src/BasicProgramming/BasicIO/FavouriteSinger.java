package BasicProgramming.BasicIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class FavouriteSinger {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        long[] favSingers = new long[n];
        String[] favSingersString = bufferedReader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            favSingers[i] = Long.parseLong(favSingersString[i]);
        }
        final long mostFavSinger = getMostFavSingerCount(n, favSingers);

        System.out.println(mostFavSinger);
    }

    private static long getMostFavSingerCount(long n, long[] favSingers) {
        HashMap<Long, Long> singerCount = new HashMap<>();
        long mostFavSingerCount = 0;
        long mostFavSinger = 0;
        for (int i = 0; i < n; i++) {
            long favSingerCount = singerCount.getOrDefault(favSingers[i], 0L) + 1;
            singerCount.put(favSingers[i], favSingerCount);
            if(mostFavSingerCount < favSingerCount){
                mostFavSingerCount = favSingerCount;
                mostFavSinger = 1;
            }
            else if(mostFavSingerCount == favSingerCount){
                mostFavSinger++;
            }
        }
        return mostFavSinger;
    }
}
