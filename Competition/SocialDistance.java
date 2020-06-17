import java.util.Scanner;

public class SocialDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            StringBuffer sb = new StringBuffer(s);
            if(k>= s.length()){
                boolean flag= true;
                for(int i=0;i<s.length();i++){
                    if(s.charAt(i)=='1'){
                        flag=false;
                        break;
                    }
                }
                if(flag)
                    System.out.println("1");
                else
                    System.out.println("0");
                t--;
                continue;
            }
            int count=0;
            int prev =-1;
            for(int i=0; i<s.length(); i++){
                int x=k;
                boolean flag1 = true;
                if(sb.charAt(i)=='1')
                    prev=i;
                if(prev==-1)
                    flag1=true;
                else{
                    if(Math.abs(i-prev)-1 >= k){
                        flag1= true;
                        //System.out.println("1   "+i+ " "+prev);
                    }
                    else{
                        //System.out.println("1.1 "+i+" "+prev);
                        flag1=false;
                    }
                }
                if(!flag1)
                    continue;
                // if(i-1 >= 0){
                //     for(int j=i-1;j>=0;j--){
                //         if(x==0)
                //             break;
                //         if(sb.charAt(j)=='1'){
                //             //System.out.println("1 "+i+" "+j);
                //             flag1=false;
                //             break;
                //         }
                //         x--;
                //     }
                // }
                boolean flag2 = true;
                x=k;
                for(int j=i+1;j<sb.length();j++){
                    if(x==0)
                        break;
                    if(sb.charAt(j)=='1'){
                        //System.out.println("2.0  "+i+" "+j);
                        flag2=false;
                        prev=j;
                        i=j;
                        break;
                    }
                    x--;
                }
                if(flag1 && flag2){
                    sb.replace(i, i+1, "1");
                    prev=i;
                    i=i+k;
                    //System.out.println(sb);
                    count++;
                }
        }
        System.out.println(count);
        t--;
    }
    sc.close();

}
}