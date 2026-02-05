
import java.util.ArrayList;
import java.util.List;

public class Letcode448 {
    public static void main(String[] args) {
        int []nums={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));

    }
    public static List<Integer> findDisappearedNumbers(int[] arr
    ) {
        int i =0;
        while(i< arr.length){
            int correct=arr[i]-1;
            if(arr[i] !=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }
        List<Integer> ans =new ArrayList<>();
        for (int index=0;index<arr.length;index++){
            if (arr[index] != index+1){
                ans.add(index+1);
            }
        }
       return ans;
    }
}
