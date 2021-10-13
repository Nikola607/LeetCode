import java.util.Scanner;

public class mySqrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(Sqrt(number));
    }

    private static int Sqrt(int x) {
        if(x == 0){
            return 0;
        } else if (x == 1) {
            return 1;
        }

        double t;
        double squareroot = x / 2;
        do
        {
            t = squareroot;
            squareroot = (t + (x / t)) / 2;
        }
        while ((t - squareroot) != 0);
        return (int) Math.floor(squareroot);
    }
}
