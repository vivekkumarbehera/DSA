package Array;

public class DeleteNum {
    public static void main(String[] args) {
        int arr[]={1,4,5,6,8,9};
        int Del_num=5;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==Del_num){
                continue;
            }
            System.out.print(arr[i]+",");
        }
    }
}
