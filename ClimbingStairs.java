import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        int[] steps = new int[46];
        steps[1] = 1;
        steps[2] = 2;

        if (n == 2) {
            return 2;
        } else if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            for (int i = 3; i <= n; i++) {
                steps[i] = steps[i - 1] + steps[i - 2];
            }
        }

        return steps[n];
    }
}
