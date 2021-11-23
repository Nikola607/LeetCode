import java.util.Arrays;
import java.util.Scanner;

public class MergeSortArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] nums1 = Arrays.stream(scan.nextLine().split(","))
                .mapToInt(Integer::parseInt).toArray();
        int[] nums2 = Arrays.stream(scan.nextLine().split(","))
                .mapToInt(Integer::parseInt).toArray();
        int m = Integer.parseInt(scan.nextLine());

        int n = Integer.parseInt(scan.nextLine());

        merge(nums1, m, nums2, n);
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        int i = m-1;
        int j = n-1;

        while (i >= 0 && j >= 0){
            if(nums1[i] >= nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while (j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }

        System.out.println(Arrays.toString(Arrays.stream(nums1).toArray()));
//        1,2,3,0,0,0
//        2,5,6
//        3
//        3
    }
}
