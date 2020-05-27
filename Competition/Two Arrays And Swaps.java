import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n= sc.nextInt();
            int k= sc.nextInt();
            int[] a= new int[n];
            int[] b= new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
            }
            //sort a k times
            for(int i=0;i<k;i++){
                for(int j=i;j<n;j++){
                    if(a[i]>a[j]){
                        int temp = a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }


            //sort b k times 
            for(int i=0;i<k;i++){
                for(int j=i;j<n;j++){
                    if(b[i]<b[j]){
                        int temp = b[i];
                        b[i]=b[j];
                        b[j]=temp;
                    }
                }
                if(a[i]<=b[i])
                    a[i]=b[i];
                else
                    break;
            }


            //find sum
            int ans=0;
            for(int i=0;i<n;i++)
                ans+=a[i];
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}