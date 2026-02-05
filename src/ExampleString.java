import java.util.ArrayList;

public class ExampleString {
    public static void main(String[] args) {
        String name1= new
                String("vivek");
        String name2= new String("vivek");
        System.out.println(name1==name2);
        String name="Vivek";
        System.out.println(name.charAt(0));
        float a=453.8765f;
        System.out.printf("formart number is %.2f",a);

        //placeholder
        System.out.printf("hello my name is %s and iam very %s","vivek","cool");
        System.out.println('a'+'b');
        System.out.println('a'+3);
        System.out.println("a"+"b");
        int value;
      //  String ans=new Integer(34)+""+new ArrayList<>();
        String name3 = new String("vivek");
        String name4=new String("vivek");
        System.out.println(name3==name4);
        System.out.println(name3.equals(name4));
        System.out.println("kuna l"+new ArrayList<>());
       // System.out.println(new ArrayList<>()+" "+new Integer(56));
    }


}
