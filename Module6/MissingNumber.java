package Module6;

public class MissingNumber {
    public static void main(String[] args) {

        int arr[] = {1,2,4,5};
        int n = 5;

        int total = n*(n+1)/2;

        int sum = 0;

        for(int x : arr)
            sum += x;

        int missing = total - sum;

        System.out.println("Missing Number = " + missing);
    }
}