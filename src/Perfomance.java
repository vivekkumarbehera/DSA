public class Perfomance {
    public static void main(String[] args) {
       String sh = "";
        for (int i = 0; i <26 ; i++) {
            char ch=(char)('a'+i);
            sh+=ch;


        }
        //System.out.print(sh);

        //it is there many no object is created so that we have do the String builder
      StringBuilder builder=new StringBuilder();
        for (int i = 0; i <26 ; i++) {
            char ch = (char) ('a' + i);
            builder = builder.append(ch);
        }

        System.out.println(builder.toString());
        String c="abcgba";
        System.out.println(Palindrom(c));
    }
    static boolean Palindrom(String c){
        for (int i = 0; i <c.length() ; i++) {
            char start=c.charAt(i);
            char end=c.charAt(c.length()-1-i);
            if (start != end){
                return false;
            }
        }
       return true;
    }

}
