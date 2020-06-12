import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class MatrixGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            n--;
            int rows= sc.nextInt();
            int cols= sc.nextInt();
            int[][] arr = new int[rows][cols];
            int[] rowsArr= new int[rows];
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            HashSet<Integer> hsGood = new HashSet<>();
            HashSet<Integer> hsBad= new HashSet<>();
            for(int i=0;i<cols;i++){
                for(int j=0;j<rows;j++){
                    if(j+1 == cols && arr[j][i]==0){
                        hsGood.add(i);
                        continue;
                    }
                    if(arr[j][i]==1){
                        hsBad.add(i);
                        break;
                    }
                }
            }
            System.out.println(hsGood);
            System.out.println(hsBad);
            if(hsGood.size() == 0){
                System.out.println("Vivek");
                continue;
            }
            if(hsBad.size() == 0){
                System.out.println(whoWins(hsGood.size()));
                continue;
            }
            int count=0;
            Iterator<Integer> itr = hsGood.iterator();
            while(itr.hasNext()){
                int x = itr.next();
                for(int i=0;i<rows;i++){
                    if(i+1 == rows && arr[i][x]==0 )
                        count++;
                    if(arr[i][x]==1)
                        break;
                }
            }
            System.out.println(count);
            System.out.println(whoWins(count));
            // for(int i=0;i<rows;i++){
            //     for(int j=0;j<cols;j++){
            //         if(j+1 == cols && arr[i][j]== 0){
            //             for(int k=0;k<cols;)
            //         }
            //         if(arr[i][j]== 1)
            //             break;
            //     }
            // }
            // if(flag){
            //     System.out.println("Vivek");
            //     continue;
            // }
            // for(int i=0;i<cols;i++){
            //     for(int j=0;j<rows;j++){
            //         if(j+1 == cols && arr[j][i]==0){
            //             if(rowArr)
            //         }
            //     }
            // }
        }
        sc.close();
    }
    public static String whoWins(int count){
        if(count%2 !=0)
            return "Ashish";
        else
            return "Vivek";
    }
}