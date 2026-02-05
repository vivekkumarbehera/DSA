public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={12,3,4,5,9};
       max(arr);
        System.out.println("sorted array");
        for (int num : arr){
            System.out.println(num+" ");
        }


    }
    static void max(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            int lastindex= arr.length-i-1;
            int maxindex=getmaxindex(arr,0,lastindex);

            int temp = arr[maxindex];
            arr[maxindex] = arr[lastindex];
            arr[lastindex] = temp;
        }

    }
    private static int getmaxindex(int []arr,int start,int end){
        int max=start;
        for (int i = 0; i <= end ; i++) {
            if(arr[max] < arr[i]){
                max=i;
            }
        }
        return max;
    }
}
