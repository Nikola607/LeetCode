import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = Arrays.stream(scan.nextLine().split(","))
                .mapToInt(Integer::parseInt).toArray();
        int num = Integer.parseInt(scan.nextLine());

        System.out.println(removeElement(nums, num));
    }

    private static int removeElement(int[] nums, int val) {
        int length = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = 100;
            } else {
                length++;
            }
        }

        Arrays.sort(nums);
        return length;
    }
}
