import java.util.Scanner;

public class NewTheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int onePiece=sc.nextInt();
            int twoPiece=sc.nextInt();
            boolean flag=false;
            int total=0;
            if(2*onePiece <= twoPiece){
                flag=true;
            }
            if(flag){
                for(int i=0;i<n;i++){
                    String s =sc.next();
                    for(int j=0;j<m;j++){
                        if(s.charAt(j) =='.')
                            total+=onePiece;
                    }
                }
            }
            else{
                for(int i=0;i<n;i++){
                    String s =sc.next();
                    for(int j=0;j<m;j++){
                        if(s.charAt(j) =='.'){
                            if(j+1 <m && s.charAt(j+1)== '.'){
                                total+=twoPiece;
                                j++;
                            }
                            else
                                total+=onePiece;
                        }
                    }
                }
            }
            System.out.println(total);
            t--;
        }
    }
}