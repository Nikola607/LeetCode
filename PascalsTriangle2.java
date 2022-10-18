import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PascalsTriangle2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int rowIndex = Integer.parseInt(scan.nextLine());

        List<Integer> list = pascalsTriangle(rowIndex);

        list.forEach(e-> System.out.print(e + " "));
    }

    private static List<Integer> pascalsTriangle(int rowIndex) {

        Integer[] row = new Integer[rowIndex + 1];
        Arrays.fill(row, 0);
        row[0] = 1;

        for(int i = 1; i <= rowIndex; i++){
            for(int j = i; j > 0; j--){
                row[j] = row[j] + row[j-1];
            }
        }

        return Arrays.asList(row);
    }

}
