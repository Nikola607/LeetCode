public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i<nums.length; i++){
            for(int j = i + 1; j<nums.length; j++){
                int sum = nums[i] + (nums[j]);
                if(sum == target){
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two solutions.");
    }
}
