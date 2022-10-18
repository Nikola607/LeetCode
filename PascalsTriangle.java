import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numRows = Integer.parseInt(scan.nextLine());

        List<List<Integer>> list = pascalsTriangle(numRows);

        list.forEach(e -> System.out.print(e + " "));
    }

    private static List<List<Integer>> pascalsTriangle(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        for(int k = 0; k < numRows; k++) {
            Integer[] row = new Integer[k + 1];

            Arrays.fill(row, 0);
            row[0] = 1;

            for (int i = 1; i <= k; i++) {
                for (int j = i; j > 0; j--) {

                    row[j] = row[j] + row[j - 1];
                }
            }
            list.add(Arrays.asList(row));
        }

        return list;
    }
}
