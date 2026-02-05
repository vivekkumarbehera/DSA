public class linear_serach {
    public static void main(String[] args) {
        int num[] ={12,3,8,5,3};
        int target=12;

        int result=linnersearch(num,target);
        if(result == target){
            System.out.println("the element found in the index : " + result);

        }
        else
            System.out.println("the element is not found in there" + result);

    }


    public static  int linnersearch(int[] num,int target){
        for(int i=0;i< num.length;i++){
            if(num[i]==target)
                return  i;
        }
        return -1;

    }
}
