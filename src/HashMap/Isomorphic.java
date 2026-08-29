package HashMap;

import java.util.HashMap;

public class Isomorphic {
    public static void main(String[] args) {
        String s = "add";
        String g="egg";
        System.out.println(isIsomorphic(s,g));

    }
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm = new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            if(hm.containsKey(s.charAt(i))){
                if(hm.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
            else {
                if(hm.containsValue(t.charAt(i))){
                    return false;
                }
                hm.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}
