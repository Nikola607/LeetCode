import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        System.out.println(removeDuplicates(numbers));
    }

    public static int removeDuplicates(int[] nums) {
        Set<Integer> duplicates = new TreeSet<>();

        for(int i = 0; i < nums.length; i++){
                duplicates.add(nums[i]);
        }

        return duplicates.size();
    }
}
