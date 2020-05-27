import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuffer sb = new StringBuffer(s);
        char x= s.charAt(0);
        x=Character.toUpperCase(x); 
        String p = Character.toString(x);
        sb.replace(0, 1, p);
        System.out.println(sb.toString());
        sc.close();
    }
}