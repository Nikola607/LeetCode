import java.util.Arrays;
import java.util.Scanner;

public class SortColors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] nums = Arrays.stream(scan.nextLine().split(","))
                .mapToInt(Integer::parseInt).toArray();

        sortColors(nums);
    }

    private static void sortColors(int[] nums) {
        int temp;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        Arrays.stream(nums)
                .forEach(num -> System.out.print(num + " "));
    }
}
