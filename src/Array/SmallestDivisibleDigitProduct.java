package Array;

public class SmallestDivisibleDigitProduct {
    public static void main(String[] args) {
        System.out.println(smallest(10,2));

    }
    public static int smallest(int n , int t){
        int number = n;
        int mul = 1;
        while(n > 0 ){
            int rem = n % 10;
            mul = mul * rem;
            n = n / 10;
        }
        if(mul % t != 0){
            number++;
        }else{
            return number;
        }
        return number;
    }
}
