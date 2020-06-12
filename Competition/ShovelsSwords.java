import java.util.Scanner;

public class ShovelsSwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            System.out.println(getEmeralds(sc.nextInt(), sc.nextInt()));
            n--;
        }
        sc.close();
    }
    public static int getEmeralds(int x,int y){
        int count=0;
        while(true){
            if(x==0 || y==0){
                //System.out.println("Hello 4");
                return count;
            }
            else if(x>=2*y){
                //System.out.println("Hello 1"+x+" "+y);
                return count+y;
            }
            else if(x == y){
                //System.out.println("Hello 2");
                return count+(int)((x+y)/3);
            }
            else if(y>=2*x){
                //System.out.println("Hello 3");
                return count+x;
            }
            else{
                count++;
                //System.out.println("Hello /"+ count);
                if(x>y){
                    x-=2;
                    y-=1;
                }
                else{
                    x-=1;
                    y-=2;
                }
            }

        }
        
    }
}