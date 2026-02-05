public class RoatedForUnderstanding {
        public static void main(String[] args) {
            int []arr={7,8,9,1,2,3,4,5,6};
            int target=1;
            int result=roat(arr,target);
            System.out.println(result);
        }
        public static int roat(int[] na,int target){
            int start=0;
            int end = na.length-1;
            while(start <= end-1){
                int mid=start+end-start/2;
                if(na[mid]==target){
                    return mid;
                }
                if(na[start] <= na[mid]){
                    if(na[start] <= target && target <= na[mid]){
                        end = mid-1;
                    }
                    else{
                        start=mid+1;
                    }
                }
                else{
                    if(na[mid]<= target && target <= na[end]){
                        start=mid+1;
                    }
                    else{
                        end=mid-1;
                    }
                }
            }
            return -1;
        }

    }
