public class Moutaindew {
    public static void main(String[] args) {
 int arr[]={3,4,5,1};
        System.out.println(peak(arr));
    }
    public static int peak(int[]  arr){
        for(int i=0;i< arr.length;i++){
            if(arr[i]<arr[i+1]){
                return i+1;
            }
            else
                return i;
        }
        return -1;
    }
}
