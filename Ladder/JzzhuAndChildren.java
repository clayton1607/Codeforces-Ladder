import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class JzzhuAndChildren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> arrKey = new ArrayList<>();
        ArrayList<Integer> arrValue = new ArrayList<>();
        for(int i=0;i<n;i++){
            arrKey.add(i+1);
            arrValue.add(sc.nextInt());
        }
        int last=-1;
        while(arrValue.size()!=0){
            int value=arrValue.get(0);
            int key= arrKey.get(0);
            if(value <= k){
                if(arrKey.size()==1)
                    last=key;
                arrKey.remove(0);
                arrValue.remove(0);
            }
            else{
                arrKey.add(key);
                arrValue.add(value-k);
                arrKey.remove(0);
                arrValue.remove(0);
            }
        }
        System.out.println(last);
        sc.close();
    }
}