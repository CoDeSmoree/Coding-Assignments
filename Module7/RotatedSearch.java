package Module7;

class RotatedSearch {

    public static void main(String[] args){

        int arr[] = {6,7,8,1,2,3,4};
        int key = 2;

        int low=0, high=arr.length-1;

        while(low<=high){

            int mid=(low+high)/2;

            if(arr[mid]==key){
                System.out.println("Found at "+mid);
                return;
            }

            if(arr[low] <= arr[mid]){

                if(key>=arr[low] && key<arr[mid])
                    high=mid-1;
                else
                    low=mid+1;
            }

            else{

                if(key>arr[mid] && key<=arr[high])
                    low=mid+1;
                else
                    high=mid-1;
            }
        }

        System.out.println("Not found");
    }
}
