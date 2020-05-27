import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<s.length();i+=2){
            arr.add(Character.getNumericValue(s.charAt(i)));
        }
        Collections.sort(arr);
        //System.out.println(arr);
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<arr.size();i++){
            sb.append(arr.get(i));
            if(i!= (arr.size()-1))
                sb.append("+");
        }
        System.out.println(sb);
        sc.close();
    }
}