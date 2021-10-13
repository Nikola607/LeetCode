import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[10000];
        int number = Integer.parseInt(scan.nextLine());


        System.out.println(searchInsert(nums, number));
    }

    private static int searchInsert(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++){
            if(target <= nums[i]){
                return i;
            }
        }

        return nums.length;
    }
}
