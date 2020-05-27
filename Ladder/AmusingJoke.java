import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.next();
        String q = sc.next();
        String s = sc.next();
        if (p.length() + q.length() != s.length())
            System.out.println("NO");
        else {
            System.out.println(ifEqualLetter(p, q, s));
        }
        sc.close();
    }

    public static String ifEqualLetter(String p, String q, String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            if (hm.containsKey(p.charAt(i)))
                hm.put(p.charAt(i), hm.get(p.charAt(i) )+1);
            else
                hm.put(p.charAt(i), 1);
        }
        for (int i = 0; i < q.length(); i++) {
            if (hm.containsKey(q.charAt(i)))
                hm.put(q.charAt(i), hm.get(q.charAt(i) )+1);
            else
                hm.put(q.charAt(i), 1);
        }
        //System.out.println(hm);
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))){
                if(hm.get(s.charAt(i))== 0)
                    return "NO";
                hm.put(s.charAt(i), hm.get(s.charAt(i))- 1);
            }
            else
                return "NO";
        }
        //System.out.println(hm);
        for(Map.Entry m : hm.entrySet()){
            if((int)m.getValue() !=0)
                return "NO";
        }
        return "YES";
    }
}