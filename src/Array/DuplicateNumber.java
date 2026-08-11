package Array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {
    public static void main(String[] args) {
        int nums[] = {1,5,4,2,1,4,7};
        Dup(nums);
    }
    public static void Dup(int nums[]){
        Set<Integer> num = new HashSet<>();
        for (int n : nums){
            if(num.contains(n)){
                System.out.print(n  + " ");
            }
            num.add(n);
        }
        return ;
    }
}
