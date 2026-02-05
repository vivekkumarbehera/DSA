public class twod_search {
    public static void main(String[] args) {
        int num[][]={{12,3,4,3},
                {34,13,44,5},
                {45,28,94,54}};
        int target=90;
      int result =  twodsearch(num,target);
      if(result == target){
          System.out.println("result is found"+ result);
      }
      else {
          System.out.println("result not found");
      }
    }
    static int twodsearch(int [][]num,int target){
        for(int row=0;row<num.length;row++){
            for(int column=0;column<num[row].length;column++){
                if (num[row][column]== target){
                    return num[row][column];
                }
            }
        }
        return -1;
    }
}
