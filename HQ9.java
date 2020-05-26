import java.util.Scanner;

public class HQ9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        System.out.println(ifHCQ(s));
        sc.close();
    }
    public static String ifHCQ(String s){
        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);
            if(x== 'H' || x== '9' || x== 'Q' ){
                //System.out.println(x);
                return "YES";
            }
        }
        return "NO";
    }
}