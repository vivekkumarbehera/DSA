package Array;

public class MaximumHeightNumber {
    public static void main(String[] args) {
        int [] r={7,9,5,6,13,2};
        MaximumHeight(r);

    }
    public static void MaximumHeight(int arr[]){
        int height = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] < arr[j]){
                    height = Math.max(height,arr[j]-arr[i]);
                }
            }
        }
        System.out.println(height);
    }
}
