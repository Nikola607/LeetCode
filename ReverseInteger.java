import java.util.*;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = Integer.parseInt(scan.nextLine());

        int reversed = 0;
        while (x != 0){
            int pop = x % 10;
            x = x / 10;
            if(reversed > Integer.MAX_VALUE / 10){
                reversed=0;
                break;
            }
            if(reversed < Integer.MIN_VALUE / 10){
                reversed = 0;
                break;
            }
            reversed = reversed * 10 + pop;
        }
        return reversed;
    }
}
