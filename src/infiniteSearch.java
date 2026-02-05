public class infiniteSearch {
    public static void main(String[] args) {
        int arr[]={2,3,5,6,7,8,10,11,12,15,20,23,30};
        int target=15;
        System.out.println(range(arr,target));



    }
    public static int range(int arr[],int target){
        //intial of the starting
        int start=0;
        int end =1;
        while(target > arr[end]){
            int newstart=end+1;
            end= end + (end-start+1)*2;
            start=newstart;
        }
        return binnarysearch(arr,target,start,end);
    }
    public static  int binnarysearch(int num[],int target,int start,int end){


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (num[mid] == target){
                return mid;
            } else if (num[mid] < target) {
                start=mid+1;
            }
            else
                end= mid-1;

        }
        return -1;

    }
}

