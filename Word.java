import java.util.Scanner;

public class Word {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        System.out.println(getWord(s,len));
    }
    public static String getWord(String s,int len){
        int lower=0;
        int upper=0;
        int half= (int)Math.ceil(len/2.0); 
        for(int i=0;i<len;i++){
            // System.out.println(lower+" "+half+" "+upper);
            if((int)s.charAt(i)>96){
                lower++;
                if(lower== half)
                    return s.toLowerCase();
            }
            else{
                upper++;
                if(upper == half && len%2!=0)
                    return s.toUpperCase(); 
                if(upper> half)
                    return s.toUpperCase();
            }
        }
        return s.toLowerCase();
    }
}