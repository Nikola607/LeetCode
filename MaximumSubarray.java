import java.util.Arrays;
import java.util.Scanner;

public class MaximumSubarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] nums = Arrays.stream(scan.nextLine().split(","))
                .mapToInt(Integer::parseInt).toArray();

        System.out.println(maximumSubarray(nums));
    }

    public static int maximumSubarray(int[] nums) {

        if(nums.length < 2){
            return  nums[0];
        }

        int sum = 0;
        int bestSum = nums[0];

        for (int num : nums) {
            sum += num;

            if (bestSum < sum) {
                bestSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        return bestSum;
    }
}
