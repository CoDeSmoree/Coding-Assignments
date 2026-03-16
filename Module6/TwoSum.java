package Module6;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int arr[] = {2,7,11,15,3,6};
        int target = 9;

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while(left < right){

            int sum = arr[left] + arr[right];

            if(sum == target){
                System.out.println(arr[left]+" "+arr[right]);
                break;
            }
            else if(sum < target)
                left++;
            else
                right--;
        }
    }
}
