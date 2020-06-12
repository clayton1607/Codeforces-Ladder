import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Dragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        for(int i=0;i<n;i++){
            int x= sc.nextInt();
            int y= sc.nextInt();
            if(tm.containsKey(x)){
                tm.put(x, tm.get(x)+y);
            }
            else
                tm.put(x,y);
        }
        boolean flag=true;
        //System.out.println(tm);
        for(Map.Entry m : tm.entrySet()){
            int x = (int)m.getKey();
            int y = (int)m.getValue();
            // System.out.println(s);
            if(s>x){
                s+=y;
            }
            else{
                // System.out.println(s);
                flag=false;
                break;
            }
        }
        if(flag)
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}