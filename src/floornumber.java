public class floornumber {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,16,18};
        int target=14;
        System.out.println(floornum(arr,target));

    }
    static int floornum(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        int result=-1;
        while(start <= end){
            int mid=start+(end-start)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                result=arr[mid];
                start = mid+1;

            }
            else
                end=mid-1;
        }
        return result;
    }
}
