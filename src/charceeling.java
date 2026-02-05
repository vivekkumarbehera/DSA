public class charceeling {
    public static void main(String[] args) {
        char[] letter = {'a', 'c', 'f', 'h'};
        char target = 'd';
        System.out.println(bb(letter,target));


    }
    static  char  bb(char[] letter,char target){
        int start=0;
        int end=letter.length-1;
        char result = '\0';
        while (start <= end){
            int mid=start + (end-start)/2;
            if(letter[mid] == target){
                return letter[mid];
            }
            else if (letter[mid] < target) {
                start=mid+1;

            }
            else{
                result = letter[mid];
                end = mid-1;
            }
        }
        return result;
    }
}
