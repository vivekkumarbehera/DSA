public class Primarynumber {
    public static void main(String[] args) {
        System.out.println(Isprime(13));

    }
    public static int  Isprime(int num){
        if(num <=1){
            return -1;
        }
        for (int i = 2; i <num ; i++) {
            if(num % i ==0){
                return -1;
            }
            return i;
        }
        return -1;
    }
}
