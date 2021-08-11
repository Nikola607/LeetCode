import java.util.Scanner;

public class ImplementString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String haystack = scan.nextLine();
        String needle = scan.nextLine();

        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        int index = 0;

        boolean isValid = false;

        StringBuilder sb = new StringBuilder();

        if(haystack.equals(needle)){
            return 0;
        }

        if (haystack.isEmpty() && needle.isEmpty()) {
            return 0;
        }

        if (haystack.length() < needle.length()) {
            return -1;
        }

        if (needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
            char currentSymbol = haystack.charAt(i);

            if (currentSymbol == needle.charAt(0)) {
                index = i;

                if (sb.toString().equals(needle)) {
                    isValid = true;
                    break;
                }
                for (int j = 0; j < needle.length(); j++) {
                    int counter = i;

                    if(counter >= haystack.length()){
                        return -1;
                    }

                    if (haystack.charAt(counter) == needle.charAt(j)) {
                        sb.append(needle.charAt(j));
                    } else {
                        sb.delete(0, sb.length());
                        i = index;
                        break;
                    }

                    if (sb.toString().equals(needle)) {
                        isValid = true;
                        break;
                    }

                    i++;
                }
            }

            if (isValid) {
                return index;
            }
        }

        if (isValid) {
            return index;
        } else {
            return -1;
        }
//        return haystack.indexOf(needle); One liner
    }
}
