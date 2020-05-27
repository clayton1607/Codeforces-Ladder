import java.util.HashSet;
import java.util.Scanner;

public class BoyorGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashSet<Character> hs =new HashSet<>();
        for(int i=0;i<s.length();i++){
            hs.add(s.charAt(i));
        }
        //System.out.println(s+" "+hs);
        if(hs.size()%2!=0)
            System.out.println("IGNORE HIM!");
        else
            System.out.println("CHAT WITH HER!");
        sc.close();
    }
}