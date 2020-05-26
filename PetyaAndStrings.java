import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next().toLowerCase();
        String p= sc.next().toLowerCase();
        System.out.println(getLexiOrder(s, p));
        sc.close();
    }
    public static int getLexiOrder(String s, String p){
        for(int i=0;i<s.length();i++){
            if((int)s.charAt(i)<(int)p.charAt(i))
                return -1;
            else if((int)s.charAt(i)>(int)p.charAt(i))
                return 1;

        }
        return 0;
    }
}