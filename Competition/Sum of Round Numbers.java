import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test= sc.nextInt();
        while(test!=0){
            int num= sc.nextInt();
            List<Integer> arr = new ArrayList<Integer>();
            int count=0;
            while(num!=0){
                if(num%10 !=0)
                    count++;
                arr.add(num%10);
                num/=10;
            }
            System.out.println(count);
            int j=arr.size()-1;
            for(int i=arr.size()-1;i>=0;i-- ){
                if(arr.get(i)!=0){
                    count=(int)(arr.get(i)*(Math.pow(10, j)));
                    System.out.print(count+" ");
                }
                j--;
            }
            System.out.println();
            test--;
        }

    }
}