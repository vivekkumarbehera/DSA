package Array;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[]={5,1,2,6,4,4,5};
        Num(arr);
    }
    public static void Num(int []arr){
        int j = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] != arr[i+1]){
                arr[j++]=arr[i];
            }
        }
        arr[j++]=arr[arr.length-1];
        for (int i = 0; i < j ; i++) {
            System.out.print(arr[i]);
        }
    }
}
