public class even_digit {
    public static void main(String[] args) {


    }
    static int even(int num){
        int count=0;
        while(num > 0){
            count ++;
            num = num/ 10;

        }
        return count;
    }
}
