package Module6;

public class NegativeFirst {
    public static void main(String[] args) {

        int arr[] = {3,-2,5,-7,6,-1};

        int left = 0;
        int right = arr.length - 1;

        while(left < right){

            while(arr[left] < 0)
                left++;

            while(arr[right] >= 0)
                right--;

            if(left < right){

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        for(int x : arr)
            System.out.print(x+" ");
    }
}
