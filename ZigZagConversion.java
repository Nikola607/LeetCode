import java.util.Scanner;

public class ZigZagConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        int numRows = Integer.parseInt(scan.nextLine());

        System.out.println(convert(s, numRows));
    }

    private static String convert(String s, int numRows) {

        if(s.length() == 1){
            return s;
        }

        char[][] matrix = new char[numRows][1000];
        StringBuilder sb = new StringBuilder();

        int counter = 0;
        int row = 0;
        int col = 0;

        while (counter < s.length()) {
            for (int i = 0; i < numRows; i++) {
                if(counter == s.length()){
                    break;
                }
                matrix[i][col] = s.charAt(counter);
                counter++;
            }
            col++;
            row = numRows - 2;

            for (int i = row; i > 0; i--) {
                if(counter == s.length()){
                    break;
                }
                matrix[i][col] = s.charAt(counter);
                col++;
                counter++;
            }
        }

        for(int rows = 0; rows < matrix.length; rows++){
            for(int cols = 0; cols < matrix[rows].length; cols++){
                if(matrix[rows][cols] > 0) {
                    sb.append(matrix[rows][cols]);
                }
            }
        }

        return sb.toString();
    }
}
