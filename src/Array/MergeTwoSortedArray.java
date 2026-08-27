package Array;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
       int a[]= {1,4,5};
       int b[]={2,5,7};
        System.out.print(merge(a,b));
    }
    public static int[] merge(int[] arr1, int [] arr2){
        int i =0;
        int  j  = 0;
        int k = 0;
        int result[] = new int[arr1.length+ arr2.length];
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                result[k++] = arr1[i++];
            }else{
            result[k++] = arr2[j++];
            }
        }
        while(i< arr1.length){
            result[k++]=arr1[i++];
        }
        while(j<arr2.length){
            result[k++]=arr2[j++];
        }
        return result;
    }
}
