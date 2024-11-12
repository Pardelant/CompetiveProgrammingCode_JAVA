package aceptaelreto23_24;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class Reto346 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = in.readLine()) != null) {
            String[] values = line.split(" ");
            int n = Integer.parseInt(values[0]);
            int a = Integer.parseInt(values[1]);

            if (n == 0 && a == 0) {
                break;
            }

            line = in.readLine();
            values = line.split(" ");
            int[] birthYears = new int[n];

            for (int i = 0; i < n; i++) {
                birthYears[i] = Integer.parseInt(values[i]);
            }

            int result = findMaxBirthsInPeriod(birthYears, a);
            System.out.println(result);
        }
    }

    public static int findMaxBirthsInPeriod(int[] birthYears, int a) {
        Map<Integer, Integer> births = new HashMap<>();
        int maxBirths = 0;

        for (int i = 0; i < birthYears.length; i++) {
            int year = birthYears[i];

            for (int j = year; j < year + a; j++) {
                births.put(j, births.getOrDefault(j, 0) + 1);
                maxBirths = Math.max(maxBirths, births.get(j));
            }
        }

        return maxBirths;
    }
}
