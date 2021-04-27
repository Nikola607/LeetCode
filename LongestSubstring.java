import java.util.*;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        System.out.println(lengthOfLongestSubstring(word));
    }
    public static int lengthOfLongestSubstring(String s) {
        int aPointer = 0;
        int bPointer = 0;
        int max = 0;

        Set<Character> set = new LinkedHashSet<>();

        while (bPointer < s.length()){
            if(!set.contains(s.charAt(bPointer))){
                set.add(s.charAt(bPointer));
                bPointer++;

                max = Math.max(set.size(), max);
            }else{
                set.remove(s.charAt(aPointer));
                aPointer++;
            }
        }

        return max;
    }
}
