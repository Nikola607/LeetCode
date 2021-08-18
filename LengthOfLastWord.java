import java.util.Scanner;

public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        System.out.println(lengthOfLastWord(word));
    }

    private static int lengthOfLastWord(String s) {
        s = s.strip();

        int maxSize = s.length() - 1;
        int count = 0;

        while (maxSize >= 0 && s.charAt(maxSize) != ' '){
            count++;
            if(maxSize == 0){
                break;
            }
            maxSize--;
        }

        return count;
    }
}
