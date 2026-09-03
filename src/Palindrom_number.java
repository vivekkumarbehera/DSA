public class Palindrom_number {
    public static void main(String[] args) {
        System.out.print(isPalindrome(10));

    }
    public static boolean isPalindrome(int x) {
        int original = x;
        int rev =0;
         while(x>0){
             int s = x % 10;
             rev = rev * 10 + s;
             x = x / 10;
         }
         if(original==rev){
             return true;
         }
         return false;
    }
}
