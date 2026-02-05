import java.util.Arrays;

public class LeetCode1122 {
    public static void main(String[] args) {
        int arr1[]={2,4,6,8,10};
        int arr2[]={3,5,7,9,10};
        System.out.println(Arrays.toString(Arrays.toString(relativeSortArray(arr1, arr2)).toCharArray()));

    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int []result=new int[2];
        for (int i = 0; i <arr1.length ; i++) {
            if(arr1[i+1]<arr1[i]){
                int temp=arr1[i+1];
                arr1[i+1]=arr1[i];
                arr1[i]=temp;
            }

        }
        for (int j=0;j< arr2.length;j++) {
            for (int i = 0; i < arr1.length; i++) {
                while (arr1[i] == arr2[j]) {
                    j++;
                    System.out.println(i);
                }
            }
        }
        return result;
    }
}
