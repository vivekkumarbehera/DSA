public class BubbleSort {
    public static void main(String[] args) {
        int []arr={5,1,1,2,0,0};
        for (int num:arr){
            System.out.println("Before the sorting element"+num);
        }
        for(int num:arr)
        System.out.println("After the sorting "+BubbleSort(arr,num-1));
    }
    static int BubbleSort(int []arr,int n){
        if(n==1){
            return 1;
        }
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i+1]>arr[i]){
                int temp=0;
                temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
            }
        }
        return BubbleSort(arr, n-1);
    }
}
