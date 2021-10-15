import java.util.Arrays;
import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = Arrays.stream(scan.nextLine().split(","))
                .mapToInt(Integer::parseInt).toArray();

        System.out.println(singleNumber(nums));
    }

    private static int singleNumber(int[] nums) {

        // Dumb Solution:
//        int bestNum = 0;
//
//        for(int i = 0; i < nums.length; i++){
//            int occurrences = 0;
//            int currentNum = nums[i];
//
//            for(int j = 0; j < nums.length; j++){
//                if(nums[j] == currentNum){
//                    occurrences++;
//                }
//
//                if(occurrences == 2 ){
//                    break;
//                }
//            }
//            if(occurrences < 2){
//                bestNum = nums[i];
//            }
//
//        }
//
//        return bestNum;


        //Fast Solution
        int result = 0;

        for(int num : nums){
            result^=num;
        }

        return result;
    }
}

