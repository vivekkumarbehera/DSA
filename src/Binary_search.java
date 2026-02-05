public class Binary_search {
    public static void main(String[] args) {
        int num[]={-1,0,3,5,9,12};
        int target=2;
        int result=binnarysearch(num,target);
        if(result == target){
            System.out.println("The result found in the index is " + result);

        }
        else
            System.out.println("the result is the found in the index" + result);

    }
    public static  int binnarysearch(int num[],int target){
        int start=-1;
        int end= num.length-1;

        while (start <= end) {
            int mid = start + end / 2;
            
            if (num[mid] == target){
                return mid;
            } else if (num[mid] < target) {
                start=mid+1;
            }
            else
                end= mid-1;

        }
   return -1;

    }
}
