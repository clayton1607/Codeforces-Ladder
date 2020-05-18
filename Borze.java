import java.util.Scanner;

public class Borze {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(getTernaryNumber(s));
        sc.close();
        
    }
    public static String getTernaryNumber(String s){
        StringBuffer sb= new StringBuffer("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='.'){
                sb.append("0");
            }
            else if(s.charAt(i) == '-'){
                if(s.charAt(i+1) == '.')
                    sb.append("1");
                else    
                    sb.append("2");
                i++;
            }
        }
        return sb.toString();
    }
}