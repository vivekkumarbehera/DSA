import java.util.Arrays;

public class InfiniteSearchSample {
    public static void main(String[] args) {
        int arr[]={2,3,5,6,7,8,10,11,12,15,20,23,30};
        int target=15;
        System.out.println(Math(arr,target));
    }
    public static int Math(int arr[],int target){
        int low=0;
        int high=1;
        while(arr[high]<target){
            low=high;
            high=low*2;
        }
        return BinarySearch( arr,target,low,high);
    }
    public static int BinarySearch(int arr[],int target,int low, int high){
        while(low <= high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return target;
            } else if (arr[mid]<target) {
                low=mid+1;

            }
            else{
                high=mid-1;
            }
        }
        return -1;

    }
}
