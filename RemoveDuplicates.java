import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(","))
                .mapToInt(Integer::parseInt).toArray();

        System.out.println(removeDuplicates(numbers));
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }

    public static int removeDuplicates(int[] nums) {
        int index = 1;
        int k = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            int first = nums[i];
            int second = nums[i + 1];
            if (first != second) {
                nums[index] = second;
                index++;
                k++;
            }
        }
        return k;
    }
}
