package Module7;

class FirstLastOccurrence {

    static int first(int arr[], int key){
        int low=0, high=arr.length-1, result=-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==key){
                result=mid;
                high=mid-1;
            }
            else if(arr[mid]<key)
                low=mid+1;
            else
                high=mid-1;
        }
        return result;
    }

    static int last(int arr[], int key){
        int low=0, high=arr.length-1, result=-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==key){
                result=mid;
                low=mid+1;
            }
            else if(arr[mid]<key)
                low=mid+1;
            else
                high=mid-1;
        }
        return result;
    }

    public static void main(String[] args){

        int arr[] = {2,4,4,4,6,8};

        System.out.println("First = " + first(arr,4));
        System.out.println("Last = " + last(arr,4));
    }
}