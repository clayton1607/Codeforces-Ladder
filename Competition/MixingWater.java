import java.util.Scanner;

public class MixingWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t!=0){
            t--;
            int hot=sc.nextInt();
            int cold=sc.nextInt();
            int temp = sc.nextInt();
            System.out.println(getCups(hot, cold, temp));
        }
    }
    public static int getCups(int hot,int cold,int temp){
        double curr = hot;
        if(curr == temp)
            return 1;
        double diff = Math.abs(temp-curr);
        int i=1;
        double min =Integer.MAX_VALUE;
        int minX=0;
        while(true){
            if(i==1000)
                return minX;
            else if(i%2 ==0){
                curr=Math.abs((curr*i+hot))/((i+1)*1.0);
            }
            else{
                curr=Math.abs((curr*i+cold*1))/((i+1)*1.0);
            }
            
            if(temp == curr)
                return i+1;
            if(diff<min){
                min=diff;
                minX=i;
            }
            diff = Math.abs(temp-curr);
            System.out.println(curr+" "+diff+" "+min+" "+i);
            i++;
        }
    }
}