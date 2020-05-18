import java.util.Scanner;
public class QueueattheSchool {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String queue= sc.next();
        System.out.println(getQueue(queue,n,t));
        sc.close();
    }
    public static String getQueue(String queue, int n, int t){
        StringBuffer sb = new StringBuffer(queue);
        boolean flag=false;
        for(int i=0;i<t;i++){
            flag=false;
            for(int j=0;j<n;j++){
                if(sb.charAt(j) == 'B'){
                    if((j+1)<n && sb.charAt(j+1) == 'G'){
                        sb.replace(j, j+2, "GB");
                        j++;
                        flag=true;
                    }
                }
            }
            if(!flag){
                // System.out.println("Hello "+ i);
                break;
            }
        }

        return sb.toString();
    }
}