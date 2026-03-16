package Module6;

public class Kanades {
    public static void main(String[] args) {
        int arr[]={2,3,-8,7,-1,3,2};
        int res=arr[0];
        int maxe=arr[0];
        for(int i=1;i<arr.length;i++){
            maxe=Math.max(maxe+arr[i],arr[i]);
            res=Math.max(res,maxe);
        }
        System.out.println(res);
    }
}

