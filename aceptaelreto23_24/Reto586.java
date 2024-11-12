package aceptaelreto23_24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reto586 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cases = Integer.parseInt(br.readLine());

        for (int c = 0; c < cases; c++) {
            int numCalendars = Integer.parseInt(br.readLine());
            String[] yearsStr = br.readLine().split(" ");
            int[] years = new int[numCalendars];

            for (int i = 0; i < numCalendars; i++) {
                years[i] = Integer.parseInt(yearsStr[i]);
            }

            int minLost = calculateMinLost(years);

            System.out.println(minLost);
        }
    }

    static int calculateMinLost(int[] years) {
        int minYear = 1930;
        int maxYear = 1990;

        boolean[] present = new boolean[maxYear - minYear + 1];
        int count = 0;

        for (int year : years) {
            if (year >= minYear && year <= maxYear) {
                present[year - minYear] = true;
            }
        }

        for (int i = minYear; i <= maxYear; i++) {
            if (!isPresent(i, years)) {
                count++;
            }
        }

        return count;
    }

    static boolean isPresent(int year, int[] years) {
        for (int y : years) {
            if (y == year) {
                return true;
            }
        }
        return false;
    }
}