import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        while(n!=0){
            String s =sc.next();
            if(s.length()>10)
                System.out.println(getShortForm(s));
            else
                System.out.println(s);
                n--;
        }
        sc.close();
    }
    public static String getShortForm(String s){
        StringBuffer sb = new StringBuffer();
        sb.append(s.charAt(0));
        sb.append(s.length()-2);
        sb.append(s.charAt(s.length()-1));
        return sb.toString();
    }
}