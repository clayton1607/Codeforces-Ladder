import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = sc.nextLine();
        System.out.println(getNumber(s, p));
        sc.close();

    }
    public static String getNumber(String s, String p){
        StringBuffer sb = new StringBuffer("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==p.charAt(i))
                sb.append("0");
            else
                sb.append("1");
        }
        return sb.toString();
    }
}