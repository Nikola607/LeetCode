import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = Arrays.stream(scan.nextLine().split(","))
                .mapToInt(Integer::parseInt).toArray();

        System.out.println(Arrays.toString(plusOne(array)));
    }

    private static int[] plusOne(int[] digits) {
        return increment(digits,digits.length-1);
    }


    public static int[] increment(int[] arr,int index){

        if(index==0 && arr[index]==9){
            int newArr[] = new int[arr.length+1];
            newArr[0] = 1;
            return newArr;
        }


        if(arr[index] != 9){
            arr[index] = arr[index]+1;
            return arr;
        }
        arr[index]=0;
        return increment(arr,index-1);
    }
}
