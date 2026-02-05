public class binarypr1 {
    public static void main(String[] args) {
int arr[]={2,4,6,8,10,12,14,16,18};
int target=13;
        System.out.println("the celling number is the " + celling(arr,target));
    }
    public  static  int celling(int arr[],int target){
        int start=0;
        int end= arr.length-1;
        int result=-1;
        while (start <= end ){
            int mid = start+(end-start) / 2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                start=mid+1;

            }
            else{
                result = arr[mid];
                end = mid-1;
            }

        }
    return result;
    }



}
