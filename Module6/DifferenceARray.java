package Module6;

public class DifferenceARray {
    public static void main(String[] args) {

        int arr[] = {10,10,10,10,10};
        int n = arr.length;

        int diff[] = new int[n];

        diff[0] = arr[0];

        for(int i=1;i<n;i++){
            diff[i] = arr[i] - arr[i-1];
        }

        int l = 1, r = 3, val = 5;

        diff[l] += val;

        if(r+1 < n)
            diff[r+1] -= val;

        arr[0] = diff[0];

        for(int i=1;i<n;i++){
            arr[i] = arr[i-1] + diff[i];
        }

        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
