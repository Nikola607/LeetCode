import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        System.out.println(isPalindrome(num));
    }

    public static  boolean isPalindrome(int x) {
        int neededNumber = x;
        int palindrome = 0;
        if(x < 0){
            return false;
        }

        while (x != 0) {
            int pop = x % 10;
            x = x / 10;

            palindrome = palindrome * 10 + pop;
        }
        return neededNumber == palindrome;
    }
}
