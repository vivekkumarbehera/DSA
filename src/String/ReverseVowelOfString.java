package String;

public class ReverseVowelOfString {

    public static void main(String[] args) {
    String name = "IceCreAm";
    System.out.print(reverseVowels(name));

    }

    public static String reverseVowels(String s) {

        int start = 0;
        int end = s.length() - 1;
        char[] c = s.toCharArray();

        while (start < end) {
            if ((c[start] == 'A' || c[start] == 'E' || c[start] == 'I' || c[start] == 'O' || c[start] == 'U' ||
                    c[start] == 'a' || c[start] == 'e' || c[start] == 'i' || c[start] == 'o' || c[start] == 'u')
                    &&
                    (c[end] == 'A' || c[end] == 'E' || c[end] == 'I' || c[end] == 'O' || c[end] == 'U' ||
                            c[end] == 'a' || c[end] == 'e' || c[end] == 'i' || c[end] == 'o' || c[end] == 'u')) {

                char temp = c[start];
                c[start] = c[end];
                c[end] = temp;
                start++;
                end--;
            }
            else if ((c[start] == 'A' || c[start] == 'E' || c[start] == 'I' || c[start] == 'O' || c[start] == 'U' ||
                    c[start] == 'a' || c[start] == 'e' || c[start] == 'i' || c[start] == 'o' || c[start] == 'u')
                    &&
                    (c[end] != 'A' && c[end] != 'E' && c[end] != 'I' && c[end] != 'O' && c[end] != 'U' &&
                            c[end] != 'a' && c[end] != 'e' && c[end] != 'i' && c[end] != 'o' && c[end] != 'u')) {

                end--;
            }
            else {
                start++;
            }
        }

        return new String(c);
    }
}